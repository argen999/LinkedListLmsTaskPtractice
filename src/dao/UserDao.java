package dao;

import model.User;

public class UserDao {
    private User[] userArray;

    public UserDao(User[] userArray) {
        this.userArray = userArray;
    }

    public User[] getUserArray() {
        return userArray;
    }

    public void setUserArray(User[] userArray) {
        this.userArray = userArray;
    }
}
