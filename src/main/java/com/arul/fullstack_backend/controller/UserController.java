package com.arul.fullstack_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.arul.fullstack_backend.model.User;
import com.arul.fullstack_backend.repository.UserRepository;
import java.util.List;
import java.util.Optional;

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


        @GetMapping("/user/{id}")
        Optional<User> getUserById(@PathVariable long id ){
        return  userRepository.findById(id);
        }
        @PutMapping("/user/{id}")
        Optional< User> updateUser(@RequestBody User newUser,@PathVariable long id){
        return userRepository.findById(id)

                .map( user -> {
                    user.setUsername(newUser.getUsername());
                    user.setEmail(newUser.getEmail());
                    user.setName(newUser.getName());
                    return userRepository.save(user);
                });

        }

        @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable long id){
        userRepository.deleteById(id);
        return "User with id "+id+" Has been deleted successfully";
        }



}
