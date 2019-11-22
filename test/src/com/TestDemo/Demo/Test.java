package com.TestDemo.Demo;

import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       Test1 h1 = new Test1();
       h1.mz = "铅笔";
       h1.ys = "黑色";
       h1.jg =5;
       Test1 h2 = new Test1();
       h2.mz = "圆珠笔";
       h2.ys = "蓝色";
       h2.jg = 6;
       Test1 h3 = new Test1();
       h3.mz = "碳素笔";
       h3.ys= "黑色";
       h3.jg= 7;
       Test1[] arr = new Test1[3];
       arr[0] = h1;
       arr[1] = h2;
       arr[2] = h3;
       System.out.println("欢迎光临");
       for (int i = 0;i<arr.length;i++){
           if (arr[i] != null){
               System.out.println("------------------------");
               System.out.println("商品序号:"+i);
               System.out.println("商品名称:"+arr[i].mz);
               System.out.println("商品颜色:"+arr[i].ys);
               System.out.println("商品价格:"+arr[i].jg);
           }
       }
       for (int i =1;i==1;){
           System.out.println("请选择商品");
           int x = sc.nextInt();
           if (x < arr.length && x >= 0) {
               System.out.println("商品序号:" + x);
               System.out.println("商品名称:" + arr[x].mz);
               System.out.println("商品颜色:" + arr[x].ys);
               System.out.println("商品价格:" + arr[x].jg);
           }else{
               System.out.println("你输入的商品不存在");

           }
           System.out.println("你还要继续购买吗");
           System.out.println("1代表继续");
           System.out.println("0代表不继续");
           System.out.println("请输入一个数字");
           i= sc.nextInt();
       }
    }
}
