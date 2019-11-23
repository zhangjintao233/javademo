package com.DengLu.Demo.Demo;

import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Test1 xc = new Test1();
        int h = sc.nextInt();
        int g = sc.nextInt();
        xc.setGj(h);
        xc.setFg(g);
        System.out.println("攻击是"+xc.getGj());
        System.out.println("法攻是"+xc.getFg());
        xc.setGj(100000);
        System.out.println("攻击是"+xc.getGj());
    }
}
