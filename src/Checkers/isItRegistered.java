package Checkers;

import Controller.LoggingUser;
import Controller.User;
import Database.RetrieveDataFromDatabase;

import java.util.ArrayList;

public class isItRegistered {

    public static boolean isItRegistered(LoggingUser user){
        RetrieveDataFromDatabase retrieveDataFromDatabase = new RetrieveDataFromDatabase();
        ArrayList<User> registeredUsers = retrieveDataFromDatabase.getAllUser();

        for(User inDatabase : registeredUsers){
            if(inDatabase.getLoginName().equals(user.getUserName()) && inDatabase.getLoginPassword().equals(user.getPassword()))
            return true;
        }

        return false;
    }
}
