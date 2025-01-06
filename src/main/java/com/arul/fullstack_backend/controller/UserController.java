package com.arul.fullstack_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arul.fullstack_backend.model.User;
import com.arul.fullstack_backend.repository.UserRepository;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    


    @Autowired
    private UserRepository userRepository;


    @PostMapping("/user")
    public ResponseEntity<User> newUser(@RequestBody User newUser) {
        User savedUser = userRepository.save(newUser);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);  // 201 Created
    }



    @GetMapping("/users")
        List<User> getAllUsers(){
            return userRepository.findAll();
        }
    
}
