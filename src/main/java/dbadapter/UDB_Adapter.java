package dbadapter;

import interfaces.IUserDatabase;

public class UDB_Adapter implements IUserDatabase {
    @Override
    public void registeringUser(String email, String username, int age) {

    }

    public boolean usernameExists(String username) {
        return false;
    }
}
