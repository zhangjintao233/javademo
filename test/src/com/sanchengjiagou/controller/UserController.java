package com.sanchengjiagou.controller;

import com.sanchengjiagou.pojo.Users;
import com.sanchengjiagou.service.UserService;

//控制层
public class UserController {
    private UserService us = new UserService();

    public String zhuc(String a,String b){
        String ou = us.zhuce(a, b);
        return ou;
    }
}
