package com.example.baseproject.controller;

// import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.hibernate.mapping.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.baseproject.model.User;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users = new ArrayList<>(); //FIXME
//this is a temporary list while a database ins't being used
 
    @GetMapping("/{id}")
    public User user(@PathVariable("id") Long id){
        User user = new User();
        user.setId();
        user.setNome();
        user.setUsername(input);
        return user;
    }

    @PostMapping("/")
    public User user(@RequestBody User user) {
        users.add(user);//FIXME
        return user;
    }

    @GetMapping("/list")
    public List<User> list(){ //FIXME
        return users; //FIXME
    }

}