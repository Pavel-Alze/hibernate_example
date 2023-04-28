package services;

import dao.UserDaoImp;
import models.Auto;
import models.User;

import java.util.List;

public class UserService {

    private UserDaoImp usersDaoImp = new UserDaoImp();

    public UserService() {
    }

    public User findUser(int id) {
        return usersDaoImp.findById(id);
    }

    public void saveUser(User user) {
        usersDaoImp.save(user);
    }

    public void deleteUser(User user) {
        usersDaoImp.delete(user);
    }

    public void updateUser(User user) {
        usersDaoImp.update(user);
    }

    public List<User> findAllUsers() {
        return usersDaoImp.findAll();
    }

    public Auto findAutoById(int id) {
        return usersDaoImp.findAutoById(id);
    }


}