package com.proyectott2.spring.apienergia.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class userController {
    @GetMapping("/user")
    public String getUser() {
        return "user";
    }
}
