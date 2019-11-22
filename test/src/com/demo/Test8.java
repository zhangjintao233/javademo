package com.demo;

import java.util.Scanner;
public class Test8{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int h =x.nextInt();
        if (h>=0 && h<=9){
            System.out.println("他是一位数");
        }
        if (h>=10 && h<=99){
            System.out.println("他是二位数");
        }
        if (h>=100 && h<=999){
            System.out.println("他是三位数");
        }


    }
}