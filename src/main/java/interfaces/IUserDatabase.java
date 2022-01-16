package interfaces;

public interface IUserDatabase {
    boolean registeringUser(String email, String username, int age);
    boolean usernameExists(String username) throws ClassNotFoundException;
}
