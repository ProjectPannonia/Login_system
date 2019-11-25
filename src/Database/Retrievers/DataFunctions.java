package Database.Retrievers;

import UserObjects.User;

public interface DataFunctions {
    void SendTemporaryUser(String temporaryUserName);
    void SendNewUser(User user);
}
