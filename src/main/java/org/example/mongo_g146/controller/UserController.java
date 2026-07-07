package org.example.mongo_g146.controller;

import lombok.RequiredArgsConstructor;
import org.example.mongo_g146.model.User;
import org.example.mongo_g146.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping(value = "/all")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


    @PostMapping(value = "/add")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping(value = "/details/{id}")
    public User getUser(@PathVariable String id){
        return userRepository.findById(id).orElseThrow();
    }
}
