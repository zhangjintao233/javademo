package com.MC.GT.WE;

import java.util.Scanner;
public class Pmc{
    public static void main(String[] args){

    }


    public  void chongzhi(){
        Scanner sc = new Scanner(System.in);
        int[] aoo = new int[10];
        System.out.println("你可以充值余额.每次最多100");
        System.out.println("你要充值吗？1代表充值,0代表不充值");
        int h = sc.nextInt();
        for (h = 1;;){
            System.out.println("输入你要充值的金额");
            int h2 = sc.nextInt();
            aoo[0] =aoo[0]+h2;
            System.out.println("你的余额为:"+aoo[0]);
            System.out.println("你还要继续充值吗？1代表继续,0代表不继续");
            int u = sc.nextInt();
            if (u == 0) {
                break;
            }
        }
    }
}
