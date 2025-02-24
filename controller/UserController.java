package com.example.StudentManagement.controller;

import com.example.StudentManagement.model.User;
import com.example.StudentManagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody User user) {
        Optional<User> existingUser = userService.findByPhone(user.getPhone());
        if (existingUser.isPresent()) {
            return ResponseEntity.badRequest().body("Phone number already registered");
        }
        userService.registerUser(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/validate-login")
    public ResponseEntity<String> loginUser(@RequestBody User loginRequest) {
        Optional<User> user = userService.findByPhone(loginRequest.getPhone());

        if (user.isPresent() && user.get().getPassword().equals(loginRequest.getPassword())) {
            return ResponseEntity.ok("Login successful! Redirecting to dashboard...");
        }
        return ResponseEntity.status(401).body("Bad credentials");
    }


    @GetMapping("/dashboard")
    public ResponseEntity<String> dashboard() {
        return ResponseEntity.ok("Welcome to the dashboard!");
    }
}
