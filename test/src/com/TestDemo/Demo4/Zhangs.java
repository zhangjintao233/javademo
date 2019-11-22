package com.TestDemo.Demo4;

import java.util.Scanner;
public class Zhangs {
    static Zhangs2[] arr = new Zhangs2[100];
    static String[] ass = new String[5];
    static int[] aee = new int[5];
    static{
        ass[0]="java";
        ass[1]="峨眉";
        ass[2]="华山";
        ass[3]="朝廷";
        ass[4]="丐帮";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的名字");
        String h = sc.next();
        System.out.println("请在java   峨眉  华山  朝廷  丐帮 ");
        System.out.println("请输入你选择的门派");
        String h2 = sc.next();
        System.out.println("请输入你的性别");
        String h3 = sc.next();
        System.out.println("请输入你的年龄");
        int h4 = sc.nextInt();

        Zhangs2 xc = new Zhangs2(h,h2,h3,h4);
        int o = jilu(xc,arr);

        int u = renshu(xc,ass,aee);
        if (u == 1){

        }else {
            System.out.println("你选择的这个门派满人了，请重新选择");
        }

        int i =panduan(new Zhangs2(h,h2,h3,h4));
        if (i == 1){
            System.out.println("欢迎来到灵境");
        }else {
            System.out.println("你不能进入灵境");
        }


    }
    public static int panduan(Zhangs2 a){
        if (a != null){
            if (a.nl < 10 || a.nl >30){
                return -1;
            }
        }return 1;
    }
    public static int jilu(Zhangs2 a,Zhangs2[] arr){
        for (int i = 0;i<arr.length;i++){
            if (arr[i] != null){
                if (arr[i].xm.equals(a.xm)){
                    return -1;
                }
            }
        }
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == null){
                arr[i] =a;
                return 1;
            }
        }return -1;
    }
    public static int renshu(Zhangs2 a,String[] ass,int[] aee){
        if (a != null){
            for (int i = 0;i<ass.length;i++){
                if (arr[i] != null && arr[i].equals(a.mp)){
                    aee[i]++;
                    return 1;
                }
            }
        }return -1;
    }
}

