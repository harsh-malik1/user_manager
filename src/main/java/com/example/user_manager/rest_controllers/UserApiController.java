package com.example.user_manager.rest_controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// used to pulls user data
@RestController
@RequestMapping("/api")
public class UserApiController {
    @GetMapping("/test")
    public String justTest() {
        return "testing successfull";
    }

}
