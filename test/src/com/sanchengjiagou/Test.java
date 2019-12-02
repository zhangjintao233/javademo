package com.sanchengjiagou;

import com.sanchengjiagou.controller.UserController;

import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        UserController us = new UserController();
        System.out.println("输入你要注册的用户名");
        String h = sc.next();
        System.out.println("输入你要注册的密码");
        String h2 = sc.next();
        String op = us.zhuc(h,h2);
        System.out.println(op);
    }
}
