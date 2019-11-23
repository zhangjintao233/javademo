package com.DengLu.Demo.Demo;

import java.util.Scanner;
public class DengLu2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DengLu gt = new DengLu();
        System.out.println("输入你要注册的用户名");
        String h2 = sc.next();
        gt.setYhm(h2);
        System.out.println("输入你要注册的密码");
        String h3 = sc.next();
        gt.setMim(h3);
        System.out.println("输入你的用户名");
        String h = sc.next();
        System.out.println("输入你的密码");
        String k = sc.next();
        DengLu x =kk(h,k,gt);
        if (x != null){
            System.out.println(gt.kzc());
        }else{
            System.out.println("你输入的用户名或密码不正确");
        }

    }public static DengLu kk(String a,String b,DengLu c){
        if (a.equals(c.getYhm()) && b.equals(c.getMim())){
            return c;
        }return null;
    }
}
