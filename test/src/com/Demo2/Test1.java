package com.Demo2;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args){
        Scanner l = new Scanner(System.in);
        System.out.print("请输入一个数字:");
        int h = l.nextInt();
        System.out.print("请输入一个数字:");
        int i = l.nextInt();
        xc(h,i);
    }
    public  static void xc(int a,int b){
        System.out.print("他们的和是:");
        System.out.println( a+b);
        System.out.print("他们的差是:");
        System.out.println( a-b);
        System.out.print("他们的积是:");
        System.out.println( a*b);
        System.out.print("他们的商是:");
        System.out.println( a/b);
        System.out.print("取摸是:");
        System.out.println( a%b);

        }
    }

