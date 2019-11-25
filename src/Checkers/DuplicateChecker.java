package Checkers;

import UserObjects.User;
import Database.Retrievers.GetData;

import java.util.ArrayList;

public class DuplicateChecker
{
    GetData createListFromDatabase = new GetData();
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
