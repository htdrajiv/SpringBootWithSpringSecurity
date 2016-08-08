package com.rajiv.practice.springBoot.controller;

import com.rajiv.practice.springBoot.domain.User;
import com.rajiv.practice.springBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Rajiv on 7/31/2016.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/addNewUser", method = RequestMethod.GET)
    public String addNewUser(){
        return "addUser";
    }

    @RequestMapping(value = "/saveUser")
    public String saveUser(User user) throws SQLException {
        userService.saveUser(user);
        return "redirect:/user/userList";
    }

    @RequestMapping(value = "/userList")
    public String listUser(ModelMap model) throws SQLException {
        List<User> userList = userService.findAllUsers();
        model.addAttribute("users",userList);
        return "userList";
    }
}
