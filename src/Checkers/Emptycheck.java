package Checkers;

import UserObjects.User;

public class Emptycheck {

    // Return true if every cell have data

    public boolean isItEmptyString(User user) {
        String firstName = user.getFirstname();
        String lastName = user.getLastname();
        Integer zipCode = user.getZipcode();
        String city = user.getCity();
        String streetName = user.getStreetName();
        String email = user.getEmail();
        String loginName = user.getLoginName();
        String loginPassword = user.getLoginPassword();

        if(firstName != null && lastName != null && city != null && streetName != null && email != null && loginName != null && loginPassword != null){
            return true;
        }else{
            return false;
        }

    }
}
