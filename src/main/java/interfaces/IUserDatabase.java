package interfaces;

public interface IUserDatabase {
    boolean registeringUser(String email, String username, int age) throws ClassNotFoundException;
    boolean usernameExists(String username) throws ClassNotFoundException;
}
