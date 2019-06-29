package com.blogofprasoon.gfgmajor.controller;

import com.blogofprasoon.gfgmajor.model.User;
import com.blogofprasoon.gfgmajor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static String url = "http://codeforces.com/api/user.info?handles=";

    @Autowired
    UserService userService;
    @GetMapping("/greetme")
    public String getGreeting() {
        return "Hello I am there listening to your request";
    }

    @GetMapping("/user")
    public User getUserInfo(@RequestParam String handle) {
        //read data from the codeforces for the given handle
        String handleUrl = url + handle;
        userService.getUser(handleUrl);

        return null;
    }


}
