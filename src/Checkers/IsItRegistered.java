package Checkers;

import UserObjects.LoggingUser;
import Database.Retrievers.GetData;
import java.util.ArrayList;

public class IsItRegistered {

    public boolean isItRegistered(LoggingUser user){
        GetData getData = new GetData();
        //RetrieveUsernamePassword retrieveUsernamePassword = new RetrieveUsernamePassword();

        ArrayList<LoggingUser> registeredUsers =  getData.getUserNameAndPassword();

        for(LoggingUser inDatabase : registeredUsers){
            if(inDatabase.getUserName().equals(user.getUserName()) && inDatabase.getPassword().equals(user.getPassword()))
            return true;
        }

        return false;
    }
}
