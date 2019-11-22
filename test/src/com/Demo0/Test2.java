package com.Demo0;

import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){
        Scanner u = new Scanner(System.in);
        int h =u.nextInt();
        int f =u.nextInt();
        chengji(h,f);
    }
    public static int chengji(int x,int y){
        int i =x * y;
        System.out.println(i);
        return i;
    }
}
