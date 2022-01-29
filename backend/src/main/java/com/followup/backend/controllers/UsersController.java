package com.followup.backend.controllers;
import java.util.*;
import com.followup.backend.domain.User;
import com.followup.backend.response.UserResponse;
import com.followup.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Slf4j
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping("/login/{mail}/{password}")
    public List<User> login(User user){
        
        UserResponse userResponse = new UserResponse();
        return userService.findByMail(user);
        /*if( response == "encontrado"){
            userResponse.setStatus(true);
            userResponse.setMessage(response);
            return userResponse;
        }else{
            userResponse.setStatus(false);
            userResponse.setMessage(response);
            return userResponse;
        }*/
    }

    @GetMapping("/register/{mail}/{password}/{userName}")
    public String register(User user){
        userService.saveUser(user);
        return "Guardado";
    }
    
}
