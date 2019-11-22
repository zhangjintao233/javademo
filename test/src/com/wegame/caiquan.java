package com.wegame;

import java.util.Scanner;
public class caiquan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String yhm ="";
        int mim =0;
        System.out.println("请输入用户名");
        int h = sc.nextInt();
        int i =dl(h);
        }

        public static int dl(int yhm){
            if (yhm <= 0){
                System.out.println("不能用负数和0");
                return -1;
            }
            int[] ass = new int[20];
            for (int i = 0;i < yhm;i++){
                if (yhm == ass[i]){
                    System.out.println("当前用户名已拥有");
                    return -1;
                }else{
                    ass[i] = yhm;
                    System.out.println("用户注册成功");
                    break;
                }
            }return 1;
        }
}


