package com.Demo3;

import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i==0;){
            System.out.println("请输入一个数字");
            int h= sc.nextInt();
            if (h % 2 ==0){
                System.out.println("这是一个偶数");
                System.out.println("你还要继续输入吗？ 0代表继续");
                i = sc.nextInt();
            }else{
                System.out.println("这是一个奇数");
                System.out.println("你还要继续输入吗？ 0代表继续");
                i = sc.nextInt();
            }



        }
    }
}
