package com.hungle.mbf.learnspring.service;

import com.hungle.mbf.learnspring.entities.Users;
import com.hungle.mbf.learnspring.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<Users> getListUsers() {
        return userRepo.findAll();
    }
}
