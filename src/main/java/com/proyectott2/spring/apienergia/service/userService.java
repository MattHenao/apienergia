package com.proyectott2.spring.apienergia.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectott2.spring.apienergia.model.userModel;
import com.proyectott2.spring.apienergia.repository.userRepository;

@Service
public class userService {
    @Autowired
    userRepository userRepository;

    public ArrayList<userModel> getUsers(){
        return (ArrayList<userModel>) userRepository.findAll();
    }

    public userModel saveUser(userModel user){
        return userRepository.save(user);
    }
}
