package com.hungle.mbf.logindemo.service;

import com.hungle.mbf.logindemo.entities.UserDetail;
import com.hungle.mbf.logindemo.entities.Users;
import com.hungle.mbf.logindemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = repo.findByUsername(username);
        if (users == null) {
            throw new UsernameNotFoundException("404 not found");
        }
        return new UserDetail(users);
    }
}
