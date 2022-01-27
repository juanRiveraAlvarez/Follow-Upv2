package com.followup.backend.controllers;

import com.followup.backend.domain.User;
import com.followup.backend.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/login/{mail}/{password}")
    public String login(User user){
        User response = userService.searchUser(user);
        return response.getMail()+response.getPassword();
    }

    @GetMapping("/register/{mail}/{password}/{userName}")
    public String register(User user){
        userService.saveUser(user);
        return "Guardado";
    }
    
}
