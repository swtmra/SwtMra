package interfaces;

public interface PCmds {
    boolean registerUser(String email, int age, String username);
    boolean usernameExists(String username);
}
