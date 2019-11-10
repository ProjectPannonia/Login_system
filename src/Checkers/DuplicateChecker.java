package Checkers;

import Controller.User;
import Database.CreateListFromDatabase;

import java.util.ArrayList;

public class DuplicateChecker
{
    CreateListFromDatabase createListFromDatabase = new CreateListFromDatabase();
    ArrayList<User> registeredUsers = new ArrayList<>();
    private boolean flag = false;

    public boolean duplicateCheck(User newUser)
    {
        registeredUsers = createListFromDatabase.getAllUser();
        for(User actualUser : registeredUsers)
        {
            String loginName = actualUser.getLoginName();
            if (loginName.equals(newUser.getLoginName()))
                flag = true;
        }

        return flag;
    }
}
