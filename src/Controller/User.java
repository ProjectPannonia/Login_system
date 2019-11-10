package Controller;

public class User {
    private String firstname;
    private String lastname;
    private String city;
    private String streetName;
    private String email;
    private int zipcode;
    private String loginName;
    private String loginPassword;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCity() {
        return city;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getEmail() {
        return email;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getLoginName(){return loginName;}
    public String getLoginPassword(){return loginPassword;}
    public User(String firstname, String lastname, int zipcode, String city, String address, String email,String loginName,String loginPassword){
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.streetName = address;
        this.email = email;
        this.zipcode = zipcode;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
    }

}
