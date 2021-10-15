package com.hungle.mbf.learnspring.controller;

import com.hungle.mbf.learnspring.entities.Users;
import com.hungle.mbf.learnspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/public/users")
//localhost:1103/api/public/users
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<Users> findAllUsers() {
        return userService.getListUsers();
    }
}
