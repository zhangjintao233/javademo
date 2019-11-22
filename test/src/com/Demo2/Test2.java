package com.Demo2;

import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){
        Scanner l = new Scanner(System.in);
        int h = l.nextInt();
        if (h<0 || h>100){
            System.out.println("你输入的数字有误");
            return;
        }
        switch (h/10){
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("E");

        }
    }
}
