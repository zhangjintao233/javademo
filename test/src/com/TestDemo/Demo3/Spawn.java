package com.TestDemo.Demo3;

import java.util.Scanner;
public class Spawn {
    int yhm;
    int mim;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Spawn[] arr = new Spawn[10];

        System.out.println("请输入注册的用户名");
        int h = sc.nextInt();
        System.out.println("请输入注册的密码");
        int hj = sc.nextInt();
        int gt = zhuc(h,hj,arr);


    }
    public static int zhuc(int a,int b,Spawn[] arr){
        Spawn x = new Spawn();
        x.yhm = a;
        x.mim = b;
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == null){
                arr[i] = x;
            }
        }return 1;
    }
}
