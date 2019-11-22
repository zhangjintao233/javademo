package com.wegame;

import java.util.Scanner;
public class yinyong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] ass = new int[100];
        System.out.println("请输入用户名");
        int h = sc.nextInt();
        System.out.println("请输入密码");
        int k = sc.nextInt();
        int x = yonghu.zhuce(h,k,arr,ass);
        if (x==1){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }
    }
}
