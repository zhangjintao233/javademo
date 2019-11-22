package com.demo;

import java.util.Scanner;
public class Test15 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        int h = x.nextInt();
        if (h>60 && h>60){
            System.out.println("老年");
        }
        int z = x.nextInt();
        if (z>=40 && z<=60){
            System.out.println("中年");
        }
        int c = x.nextInt();
        if (c>=18 && c<=40){
            System.out.println("少年");
        }
        int v = x.nextInt();
        if (v<=18 && v<18){
            System.out.println("童年");
        }
    }
}
