package com.Demo2;

import javax.swing.*;
import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args){
        Scanner l = new Scanner(System.in);
        int h = l.nextInt();

        switch (h / 10){
            case 10:
                System.out.println("a");
                break;
            case 9:
                System.out.println("a");
                break;
            case 8:
                System.out.println("b");
                break;
            case 7:
                System.out.println("c");
                break;
            case 6:
                System.out.println("d");
                break;
            default:
                System.out.println("你输入的数字有误");

        }
    }
}
