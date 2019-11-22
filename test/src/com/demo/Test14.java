package com.demo;

import java.util.Scanner;
public class Test14 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("请输入分数");
        int h =x.nextInt();
        if (h>80 && h>=80) {
                System.out.println("进入决赛");
            }
            if (h<80 && h<80){
            System.out.println("不能进入决赛");
                return;
        }
        for (int o = 1;o>0;o++){
            System.out.println("请输入性别:0代表男,1代表女");
            int k =x.nextInt();
            if (k==0 && k==0){
                System.out.println("进入男子决赛");
                return;
            }else if (k==1 && k==1){
                System.out.println("进入女子决赛");
                return;
            }else if (k!=1 || k!=0){
                System.out.println("你输入的数字有误");
                System.out.println("请重新输入");
            }
        }

        }
    }

