package com.Demo0;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        jishu(x);
    }
    public static int  jishu(int i){
            if (i % 2 == 0){
                System.out.println("这是一个偶数");
            }else if (i % 2 !=0){
                System.out.println("这是一个奇数");
                }
            return i;
    }
}

