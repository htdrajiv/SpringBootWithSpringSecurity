package com.rajiv.practice.springBoot.service;

import com.rajiv.practice.springBoot.domain.User;
import com.rajiv.practice.springBoot.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Rajiv on 8/1/2016.
 */
@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public boolean saveUser(User user){
        userRepo.saveAndFlush(user);
        return true;
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }
}
