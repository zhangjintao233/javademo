package com.wegame;

public class Test {
    public static void main(String[] args){
        int x = 0;
        for (int i=1;i<1001;i++){
            if (i % 3 == 2 && i % 5 == 3 && i % 7 == 2){
                x++;
            }
        }
            System.out.println(x);
    }
}
