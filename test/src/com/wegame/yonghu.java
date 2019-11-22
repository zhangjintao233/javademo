package com.wegame;

import java.util.Scanner;
public class yonghu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] ass = new int[100];
        System.out.println("请输入用户名");
        int h =sc.nextInt();
        System.out.println("请输入密码");
        int k = sc.nextInt();
        int i =zhuce(h,k,arr,ass);
        if (i == 1){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }
    }public static int zhuce(int x,int y,int[] arr,int[] ass){
        if (x<0 || y<0){
            return -1;
        }
        for (int u = 0;u<arr.length;u++){
            if (x==arr[u]){
                return -1;
            }else {
                arr[u]=x;
                break;
            }
        }
        for (int t=0;t<ass.length;t++){
            if (y==ass[t]){
                return -1;
            }else{
                ass[t]=y;
                return 1;
            }
        }return 1;
    }
}
