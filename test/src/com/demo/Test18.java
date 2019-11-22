package com.demo;

public class Test18 {
    public static void main(String[] args){
        int x=0;
        int y=2;
        do{
            x=x+y;
            y=y+2;
        }while (y>=0 && y<=50);
        System.out.println(x);
    }
}
