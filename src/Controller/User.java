package Controller;

public class User {
    private String firstname;
    private String lastname;
    private String city;
    private String streetName;
    private String email;
    private int zipcode;

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

    public User(String firstname, String lastname, String city, String address, String email, int zipcode){
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.streetName = address;
        this.email = email;
        this.zipcode = zipcode;
    }

}
