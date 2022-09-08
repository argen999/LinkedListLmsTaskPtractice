package service.impl;

import dao.UserDao;
import model.User;
import myexception.MyException;
import service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void userPlus(User[] users) {
        userDao.setUserArray(users);
    }

    @Override
    public void foundId(int id) {
        try {
            for (int i = 0; i < userDao.getUserArray().length; i++) {
                if (userDao.getUserArray()[i].getId() == id) {
                    System.out.println("ID: "+userDao.getUserArray()[i].getId() );
                    System.out.println("Name: "+userDao.getUserArray()[i].getName() );
                    System.out.println("Age: "+userDao.getUserArray()[i].getAge() );
                    System.out.println("Gender: "+userDao.getUserArray()[i].getGender() );
                    System.out.println("--------------------------");
                    break;
                } else {
                    throw new MyException();
                }
            }
        } catch (MyException e) {
            System.out.println("Мы не смогли найти ID с номером "+id+"\n");
        }
    }

    @Override
    public void deleteIdUser(int id) {
        System.out.println("2 деген id менен user ди чыгарбоо!\n");
        for (int i = 0; i < userDao.getUserArray().length; i++) {
            if (userDao.getUserArray()[i].getId() == id) {
                i++;
            }
            System.out.println("ID: "+userDao.getUserArray()[i].getId() );
            System.out.println("Name: "+userDao.getUserArray()[i].getName() );
            System.out.println("Age: "+userDao.getUserArray()[i].getAge() );
            System.out.println("Gender: "+userDao.getUserArray()[i].getGender() );
            System.out.println("--------------------------");
        }
    }

    @Override
    public void usersTake() {
        System.out.println("Это все Userры:");
        for (User u:userDao.getUserArray() ) {
            System.out.println("ID: "+u.getId() );
            System.out.println("Name: "+u.getName() );
            System.out.println("Age: "+u.getAge() );
            System.out.println("Gender: "+u.getGender() );
            System.out.println("--------------------------");
        }
    }
}
