package com.sancenggouzao.controller;

import com.sancenggouzao.service.UserService;

public class UserController {
    private UserService hh = new UserService();

    public String gr(String a,String b){
        String oo = hh.zhuc(a,b);
        return oo;
    }

    public String tt(String a,String b){
        String kk = hh.dengl(a,b);
        return kk;
    }
}
