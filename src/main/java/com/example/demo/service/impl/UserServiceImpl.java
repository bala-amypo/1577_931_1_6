package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

@Service
public class UserServiceImpl {
    public User saveUser(User user){
        return user;
    }
    public User findByEmail(String email){
        return User;
    }
}
