package com.wegame;

import java.util.Scanner;
public class shuzu1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ass = new int[100];
        int[] arr = new int[100];
        System.out.println("请输入用户名");
        int h = sc.nextInt();
        System.out.println("请输入密码");
        int k = sc.nextInt();
        int r = shuzu(h,k,ass,arr);

        if (r==1){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }

    }public static int shuzu(int a,int i,int[] ass,int[] arr){
        if (a<0 || i<0){
            return -1;
        }
        for (int y=0;y<ass.length;y++){
            if (a==ass[y]){
                return -1;
            }else {
                ass[y]=a;
                break;
            }
        }
        for (int u = 0;u<ass.length;u++){
            if (i==ass[u]){
                return -1;
            }else {
                ass[u]=i;
                return 1;
            }
        }return 1;
    }
}
