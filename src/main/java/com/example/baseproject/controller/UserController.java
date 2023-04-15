package com.example.baseproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.baseproject.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/")
    public User user(){
        User user = new User();
        user.setId(1L);
        user.setNome("Elise");
        user.setUsername("e_lis_e");
        return user;
    }

}