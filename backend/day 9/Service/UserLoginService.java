package com.partyplanner.partyplanner.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.partyplanner.partyplanner.Entity.UserLogin;
import com.partyplanner.partyplanner.Repository.UserLoginRepo;

@Service
public class UserLoginService {

    @Autowired
    private UserLoginRepo userLoginRepo;

    // Get all users
    public Iterable<UserLogin> getAllUsers() {
        return userLoginRepo.findAll();
    }

    // Get user by id
    public UserLogin getUserById(int id) {
        return userLoginRepo.findById(id).orElse(null);
    }

    // Add a new user
    public UserLogin addUser(UserLogin user) {
        return userLoginRepo.save(user);
    }

    // Update an existing user
    public UserLogin updateUser(int id, UserLogin user) {
        user.setId(id);
        return userLoginRepo.save(user);
    }

    // Delete a user
    public void deleteUser(int id) {
        userLoginRepo.deleteById(id);
    }
}
