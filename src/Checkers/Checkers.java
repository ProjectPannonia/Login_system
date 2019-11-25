package Checkers;

import Database.Retrievers.GetData;
import UserObjects.LoggingUser;
import UserObjects.User;

import java.util.ArrayList;

public class Checkers implements CheckFunctions {
    GetData createListFromDatabase = new GetData();
    ArrayList<User> registeredUsers = new ArrayList<>();
    private boolean flag = false;

    @Override
    public boolean duplicateCheck(User newUser) {
        registeredUsers = createListFromDatabase.getAllUser();

        for(User actualUser : registeredUsers)
        {
            String loginName = actualUser.getLoginName();
            if (loginName.equals(newUser.getLoginName())){
                flag = true;
                //break;
            }
        }

        return flag;
    }

    @Override
    public boolean isItRegistered(LoggingUser user) {
        GetData getData = new GetData();
        //RetrieveUsernamePassword retrieveUsernamePassword = new RetrieveUsernamePassword();

        ArrayList<LoggingUser> registeredUsers =  getData.getUserNameAndPassword();

        for(LoggingUser inDatabase : registeredUsers){
            if(inDatabase.getUserName().equals(user.getUserName()) && inDatabase.getPassword().equals(user.getPassword()))
                return true;
        }

        return false;
    }

    @Override
    public boolean isItEmptyString(User user) {
            String firstName = user.getFirstname();
            String lastName = user.getLastname();
            Integer zipCode = user.getZipcode();
            String city = user.getCity();
            String streetName = user.getStreetName();
            String email = user.getEmail();
            String loginName = user.getLoginName();
            String loginPassword = user.getLoginPassword();

            if(firstName != null && lastName != null && city != null && streetName != null && email != null && loginName != null && loginPassword != null){
                return true;
            }else{
                return false;
            }

        }
    }
