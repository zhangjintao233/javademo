package com.wegame;

import java.util.Scanner;
public class shuzu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        String yhm ="";
        System.out.println("请输入用户名");
        int h = sc.nextInt();
        int i = zhuce(h,arr);
        if (i==1){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }

    }
    public static int zhuce(int x,int[] arr){
        if (x < 0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            if (x ==arr[i]){
                return -1;
            }else {
                arr[i] = x;
                break;
            }
        }return 1;
    }
}
