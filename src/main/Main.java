package main;

import dao.UserDao;
import enums.Gender;
import model.User;

import service.impl.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"Angel",18, Gender.FEMALE);
        User user2 = new User(2,"Bully",23, Gender.MALE);
        User user3 = new User(3,"Lili",13, Gender.FEMALE);
        User[] userArray = {user1,user2,user3};

        UserDao userDao = new UserDao(userArray);

        UserServiceImpl userServiceImpl = new UserServiceImpl(userDao);

        userServiceImpl.userPlus(userArray);
        userServiceImpl.foundId(1);
        userServiceImpl.deleteIdUser(2);
        userServiceImpl.usersTake();



    }
}
