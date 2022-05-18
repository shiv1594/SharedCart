package com.walmart.shared_cart.service;

import com.walmart.shared_cart.dao.UserRepo;
import com.walmart.shared_cart.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Collection<User> getAllUsers() {
        return userRepo.getAllUsers();
    }

    public User getUser(Long userId) {
        return userRepo.getUserById(userId);
    }

    public User addUser(User user) {
        return userRepo.addUser(user);
    }

    public User deleteUser(long userId) {
        User user = null;
        try {
            user = userRepo.getUserById(userId);
            userRepo.deleteUser(userId);
        } catch(Exception e) {
            System.out.println("Failed to delete user" +e);
        }
        return user;
    }
}
