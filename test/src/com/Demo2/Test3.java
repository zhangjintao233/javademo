package com.Demo2;

import java.util.Scanner;
public class Test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i==0;){
            System.out.println("-----------------");
            System.out.println("请输入一个数字");
            int h =sc.nextInt();
            int m = 0;
            for (int a = 1;a<=h;a++){
                if (h % a ==0){
                    m++;
                }
            }
            if (m == 2){
                System.out.println("这是一个素数");
            }else {
                System.out.println("这不是一个素数");
            }
            System.out.println("你还要继续吗? 0代表继续 1代表不继续");
            System.out.println("请输入一个数字");
            i=sc.nextInt();
        }

    }
}
