package Checkers;

import Database.Retrievers.GetData;
import UserObjects.LoggingUser;
import UserObjects.User;

import java.util.ArrayList;

public class Checkers implements CheckFunctions {
    GetData createListFromDatabase = new GetData();
    ArrayList<User> registeredUsers = new ArrayList<>();

    @Override
    public boolean duplicateCheck(User newUser) {
        registeredUsers = createListFromDatabase.getAllUser();
        boolean flag = false;

        for (User actualUser : registeredUsers) {
            String loginName = actualUser.getLoginName();
            if (loginName.equals(newUser.getLoginName())) {
                flag = true;
                //break;
            }
        }
        return flag;
    }

    @Override
    public boolean isItRegistered(String userName,String password) {
        GetData getData = new GetData();
        //RetrieveUsernamePassword retrieveUsernamePassword = new RetrieveUsernamePassword();
        boolean flag = false;
        ArrayList<LoggingUser> registeredUsers = getData.getUserNameAndPassword();

        for (int i = 0; i < registeredUsers.size(); i++){
            String registeredUserName = registeredUsers.get(i).getUserName();
            String registeredPassword = registeredUsers.get(i).getPassword();

            if(registeredUserName.equals(userName)){
                if(registeredPassword.equals(password))
                    flag = true;
            }
        }

        return flag;
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

        if (firstName != null && lastName != null && city != null && streetName != null && email != null && loginName != null && loginPassword != null) {
            return true;
        } else {
            return false;
        }

    }
}
