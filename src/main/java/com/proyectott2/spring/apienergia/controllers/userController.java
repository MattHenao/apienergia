package com.proyectott2.spring.apienergia.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.proyectott2.spring.apienergia.model.userModel;
import com.proyectott2.spring.apienergia.service.userService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private userService userService;

    @GetMapping("/getusers")
    public ArrayList<userModel> getUser() {
        return this.userService.getUsers();
    }

    @PostMapping("/saveusers")
    public userModel saveUser(@RequestBody userModel user) {
        return this.userService.saveUser(user);
    }
}
