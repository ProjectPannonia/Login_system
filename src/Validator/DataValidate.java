package Validator;

import UserObjects.User;

public class DataValidate implements ValidateFunctions {

    @Override
    public boolean correctUsername(User user) {
        String userName = user.getLoginName();
        char[] charsOfUsername = userName.toCharArray();
        int numberOfUpperCharacters = 0;
        int lengthOfUsername = 0;
        int numbersInUsername = 0;
        boolean specialCharacter = false;
        int maxUsernameLength = 20;
        int minUsernameLength = 8;
        boolean spaceInName = false;

        for (int i = 0; i < charsOfUsername.length; i++){
            char actualChar = charsOfUsername[i];
            if(Character.isDigit(actualChar))numbersInUsername++;
            if(Character.isUpperCase(actualChar)) numberOfUpperCharacters++;
            if(!Character.isDigit(actualChar) && !Character.isLetter(actualChar)) specialCharacter = true;
            if(Character.isSpaceChar(actualChar)) spaceInName = true;
        }


        return numbersInUsername > 0 && numberOfUpperCharacters > 0
                && lengthOfUsername < maxUsernameLength && lengthOfUsername > minUsernameLength
                && !specialCharacter && !spaceInName ? true : false;
    }

    @Override
    public boolean correctPassword(User user) {
        return false;
    }
}
