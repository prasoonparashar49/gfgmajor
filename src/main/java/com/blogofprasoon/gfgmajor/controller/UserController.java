package com.blogofprasoon.gfgmajor.controller;

import com.blogofprasoon.gfgmajor.model.User;

public class UserController {
    private static String url = "http://codeforces.com/api/user.info?handles=";

    public User getUserInfo(String handle) {
        //read data from the codeforces for the given handle
        String handleUrl = url + handle;

        return null;
    }


}
