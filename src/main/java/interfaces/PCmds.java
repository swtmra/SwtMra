package interfaces;

public interface PCmds {
    void registerUser(String email, int age, String username);

    boolean usernameExists(String username);
}
