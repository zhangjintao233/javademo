package com.demo;

public class Test9 {
    public static void main(String[] args){
        int score = 53;
        int count = 0;
        System.out.println("加分前成绩为:"+score);
        for(score=53;score<61;score++){
            System.out.println("加分次数为"+count++ + "加分成绩后"+score);
        }
    }
}
