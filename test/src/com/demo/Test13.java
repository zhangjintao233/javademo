package com.demo;

import java.util.Scanner;
public class Test13 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int h =x.nextInt();
        if (h<=17 && h>=0){
            System.out.println("未成年");
        }
        if (h<=999 && h>=18){
            System.out.println("成年了");
        }

    }
}
