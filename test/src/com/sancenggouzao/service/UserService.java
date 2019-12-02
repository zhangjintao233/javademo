package com.sancenggouzao.service;

import com.sancenggouzao.dao.UserDao;
import com.sancenggouzao.pojo.Users;

public class UserService {
    private UserDao kk = new UserDao();


    public String zhuc(String a,String b){
        if (a != null && b != null){

            Users x = kk.xiangtong(a);
            if (a == null){
                return "你输入的用户名已存在";
            }
        }
        Users gg = new Users();
        gg.setYhm(a);
        gg.setYhm(b);
        int i = kk.cz(gg);
        if (i != 1){
            return "用户注册失败";
        }
        return "用户注册成功";

    }

    public String dengl(String a,String b){
        int i = kk.dl(a,b);
        if (i == 1){
            return "登录成功";
        }return "登录失败";
    }


}
