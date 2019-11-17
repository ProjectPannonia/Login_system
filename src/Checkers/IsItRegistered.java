package Checkers;

import Controller.LoggingUser;
import Controller.User;
import Database.RetrieveAllDataFromDatabase;
import Database.RetrieveUserNameAndPassword;

import java.util.ArrayList;

public class IsItRegistered {

    public boolean isItRegistered(LoggingUser user){
        RetrieveAllDataFromDatabase retrieveAllDataFromDatabase = new RetrieveAllDataFromDatabase();
        RetrieveUserNameAndPassword retrieveUserNameAndPassword = new RetrieveUserNameAndPassword();
        ArrayList<LoggingUser> registeredUsers =  retrieveUserNameAndPassword.getUserNameAndPassword();

        for(LoggingUser inDatabase : registeredUsers){
            if(inDatabase.getUserName().equals(user.getUserName()) && inDatabase.getPassword().equals(user.getPassword()))
            return true;
        }

        return false;
    }
}
