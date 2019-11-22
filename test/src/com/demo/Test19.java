package com.demo;

public class Test19 {
    public static void main(String[] args){
        int x =0;
        for (int i =1;i<101;i++){
            if (i % 3 !=0){
                x=x+i;
            }
        }
        System.out.println(x);
    }
}
