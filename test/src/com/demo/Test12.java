package com.demo;

import java.util.Scanner;
public class Test12 {
    public static void  main(String[] args){
        Scanner x = new Scanner(System.in);
        int h = x.nextInt();
        if (h % 2 == 0){
            System.out.println("偶数");
        }
        if (h % 2 != 0){
            System.out.println("不是偶数");
        }
    }
}
