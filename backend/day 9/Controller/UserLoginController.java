package com.partyplanner.partyplanner.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.partyplanner.partyplanner.Entity.UserLogin;
import com.partyplanner.partyplanner.Service.UserLoginService;

@RestController
@RequestMapping("/api/users")

public class UserLoginController {
    private final UserLoginService userService;

    public UserLoginController(UserLoginService userService) {
        this.userService = userService;
    }

    // Get all users
    @GetMapping("")
    public Iterable<UserLogin> getAllUsers() {
        return userService.getAllUsers();
    }

    // Get user by id
    @GetMapping("/{id}")
    public ResponseEntity<UserLogin> getUserById(@PathVariable("id") int id) {
        UserLogin user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    // Add a new user
    @PostMapping("/post")
    public ResponseEntity<UserLogin> addUser(@RequestBody UserLogin user) {
        UserLogin newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    // Update an existing user
    @PutMapping("/{id}")
    public ResponseEntity<UserLogin> updateUser(@PathVariable("id") int id, @RequestBody UserLogin user) {
        UserLogin updatedUser = userService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }

    // Delete a user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
