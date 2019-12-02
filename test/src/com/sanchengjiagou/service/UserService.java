package com.sanchengjiagou.service;

import com.sanchengjiagou.dao.UserDao;
import com.sanchengjiagou.pojo.Users;

//用户业务层
public class UserService {
    private UserDao hk = new UserDao();

    public String zhuce(String a,String b){
        if (a != null && b != null){

            Users kz = hk.xiangtong(a);
            if (a != null){
                return "你输入的用户名已存在";
            }
        }
        Users gt = new Users();
        gt.setUname(a);
        gt.setPsd(b);
        int i =hk.cz(gt);
        if (i == 0){
            return "用户注册失败";
        }
        return "注册成功";
    }
}
