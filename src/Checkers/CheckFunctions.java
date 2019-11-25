package Checkers;

import UserObjects.LoggingUser;
import UserObjects.User;

public interface CheckFunctions {
    boolean duplicateCheck(User newUser);
    boolean isItRegistered(LoggingUser user);
    boolean isItEmptyString(User user);
}
