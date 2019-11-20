package UserObjects;

public class LoggingUser {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public LoggingUser(String userName,String password){
        this.userName = userName;
        this.password = password;
    }
}
