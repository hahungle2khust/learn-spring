package com.hungle.mbf.learnspring.service;

import com.hungle.mbf.learnspring.entities.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<Users> getListUsers();
}
