package Checkers;

import UserObjects.LoggingUser;
import UserObjects.User;

public interface CheckFunctions {
    boolean duplicateCheck(User newUser);
    boolean isItRegistered(String userName,String password);
    boolean isItEmptyString(User user);
}
