package com.arul.fullstack_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
        List<User> getAllUsers(){
            return userRepository.findAll();
        }



        
    
}