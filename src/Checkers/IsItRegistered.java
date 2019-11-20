package Checkers;

import UserObjects.LoggingUser;
import Database.RetrieveAllUser;
import Database.RetrieveUsernamePassword;

import java.util.ArrayList;

public class IsItRegistered {

    public boolean isItRegistered(LoggingUser user){
        RetrieveAllUser retrieveAllUser = new RetrieveAllUser();
        RetrieveUsernamePassword retrieveUsernamePassword = new RetrieveUsernamePassword();
        ArrayList<LoggingUser> registeredUsers =  retrieveUsernamePassword.getUserNameAndPassword();

        for(LoggingUser inDatabase : registeredUsers){
            if(inDatabase.getUserName().equals(user.getUserName()) && inDatabase.getPassword().equals(user.getPassword()))
            return true;
        }

        return false;
    }
}
