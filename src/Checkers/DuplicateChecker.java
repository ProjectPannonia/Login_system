package Checkers;

import Controller.User;
import Database.RetrieveDataFromDatabase;

import java.util.ArrayList;

public class DuplicateChecker
{
    RetrieveDataFromDatabase createListFromDatabase = new RetrieveDataFromDatabase();
    ArrayList<User> registeredUsers = new ArrayList<>();
    private boolean flag = false;

    //Return true if new login name is already used
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
}
