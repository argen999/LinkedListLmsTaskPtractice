package service;

import model.User;

public interface UserService {
    void userPlus(User[] users);
    void foundId(int number);
    void deleteIdUser(int number);
    void usersTake();
}
