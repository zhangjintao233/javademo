package com.Demo2;

import java.util.Scanner;
public class Test4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h =sc.nextInt();
        int j =sc.nextInt();
        jjcc(h,j);
    }
    public static int jjcc(int a,int b){
        int q =a+b;
        int w =a-b;
        int e =a*b;
        int r =a/b;
        int t =a%b;
        System.out.println("和:"+q);
        System.out.println("差:"+w);
        System.out.println("积:"+e);
        System.out.println("商:"+r);
        System.out.println("取摸:"+t);
        return t;
    }
}
