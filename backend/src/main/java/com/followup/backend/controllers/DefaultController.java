package com.followup.backend.controllers;

import com.followup.backend.response.UserResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@Slf4j
public class DefaultController {
    @GetMapping("/")
    public UserResponse def(){
        UserResponse userResponse = new UserResponse();
        userResponse.setStatus(true);
        userResponse.setMessage("Welcome to Follow-up Backend services by Juan Pablo Rivera");
        return userResponse;
    }
}
