package com.demo;

import java.util.Scanner;
public class Test11 {
    public static void  main(String[] args){
        Scanner x = new Scanner(System.in);
        int h =x.nextInt();
        if (h>=60 && h<=100){
            System.out.println("及格");
        }
        if (h>=0 && h<60){
            System.out.println("不及格");
        }
    }
}
