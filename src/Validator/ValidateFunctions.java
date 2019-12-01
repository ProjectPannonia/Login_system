package Validator;

import UserObjects.User;

public interface ValidateFunctions {
    boolean correctUsername(User user);
    boolean correctPassword(User user);
}
