package com.sancenggouzao;

import com.sancenggouzao.controller.UserController;

import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        UserController oo = new UserController();
        System.out.println("请输入你要注册的用户名");
        String h = sc.next();
        System.out.println("请输入你要注册的密码");
        String h2 = sc.next();
        String rng = oo.gr(h,h2);
        System.out.println(rng);
        System.out.println("请输入你要登录的用户名");
        String h3 = sc.next();
        System.out.println("请输入你要登录的密码");
        String h4 = sc.next();
        String bb = oo.tt(h3,h4);
        System.out.println(bb);

    }
}
