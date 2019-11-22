package com.TestDemo.Demo2;

import com.TestDemo.Demo1.Test;
import com.sun.org.apache.xerces.internal.impl.dtd.XMLContentSpec;

import java.util.Scanner;
public class Xcx {
    String yhm;
    int mim;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Xcx[] arr = new Xcx[10];
        Sxs[] ass = new Sxs[36];
        Sxs xc1 = new Sxs("生肖","鸡","苏");
        ass[0] = xc1;
        Sxs xc2 = new Sxs("生肖","马","顾");
        ass[1] =xc2;
        Sxs xc3 = new Sxs("生肖","羊","夏");
        ass[2] =xc3;
        Sxs xc4 = new Sxs("生肖","兔","陌");
        ass[3] =xc4;
        Sxs xc5 = new Sxs("生肖","龙","夜");
        ass[4] =xc5;
        Sxs xc6 = new Sxs("生肖","鼠","上官");
        ass[5] =xc6;
        Sxs xc7 = new Sxs("生肖","猪","慕");
        ass[6] =xc7;
        Sxs xc8 = new Sxs("生肖","猴","楚");
        ass[7] =xc8;
        Sxs xc9 = new Sxs("生肖","蛇","陆");
        ass[8] =xc9;
        Sxs xc10 = new Sxs("生肖","狗","程");
        ass[9] =xc10;
        Sxs xc11 = new Sxs("生肖","牛","浴");
        ass[10] =xc11;
        Sxs xc12 = new Sxs("生肖","虎","玉");
        ass[11]=xc12;
        Sxs xc13 = new Sxs("月份","1","小");
        ass[12] = xc13;
        Sxs xc14 = new Sxs("月份","2","棂");
        ass[13] =xc14;
        Sxs xc15 = new Sxs("月份","3","玥");
        ass[14] =xc15;
        Sxs xc16 = new Sxs("月份","4","浅");
        ass[15] =xc16;
        Sxs xc17 = new Sxs("月份","5","瑾");
        ass[16] =xc17;
        Sxs xc18 = new Sxs("月份","6","颜");
        ass[17] =xc18;
        Sxs xc19 = new Sxs("月份","7","曦");
        ass[18] =xc19;
        Sxs xc20 = new Sxs("月份","8","夭");
        ass[19] =xc20;
        Sxs xc21 = new Sxs("月份","9","眠");
        ass[20] =xc21;
        Sxs xc22 = new Sxs("月份","10","晴");
        ass[21] =xc22;
        Sxs xc23 = new Sxs("月份","11","莹");
        ass[22] =xc23;
        Sxs xc24 = new Sxs("月份","12","瑶");
        ass[23]=xc24;
        Sxs xc25 = new Sxs("星座","白羊座","浅");
        ass[24] = xc25;
        Sxs xc26 = new Sxs("星座","金牛座","姬");
        ass[25] =xc26;
        Sxs xc27 = new Sxs("星座","巨蟹座","盈");
        ass[26] =xc27;
        Sxs xc28 = new Sxs("星座","天蝎座","晞");
        ass[27] =xc28;
        Sxs xc29 = new Sxs("星座","摩羯座","蓉");
        ass[28] =xc29;
        Sxs xc30 = new Sxs("星座","双子座","儿");
        ass[29] =xc30;
        Sxs xc31 = new Sxs("星座","射手座","璃");
        ass[30] =xc31;
        Sxs xc32 = new Sxs("星座","狮子座","衣");
        ass[31] =xc32;
        Sxs xc33 = new Sxs("星座","处女座","仪");
        ass[32] =xc33;
        Sxs xc34 = new Sxs("星座","天秤座","之");
        ass[33] =xc34;
        Sxs xc35 = new Sxs("星座","双鱼座","绯");
        ass[34] =xc35;
        Sxs xc36 = new Sxs("星座","水瓶座","色");
        ass[35]=xc36;

        System.out.println("请注册用户名");
        String h = sc.next();
        System.out.println("请注册密码");
        int k = sc.nextInt();
        int we =zhuc(h,k,arr);
        if (we == 1){
            System.out.println("注册成功");
        }else{
            System.out.println("注册失败");
        }

        System.out.println("请输入用户名");
        String j = sc.next();
        System.out.println("请输入密码");
        int l = sc.nextInt();
        int gt =dengl(j,l,arr);
        if (gt == 1){
            System.out.println("登录成功");
        }else {
            System.out.println("你输入的用户名或密码不正确");
        }

        System.out.println("请输入你的生肖，月份，星座");
        String kl = sc.next();
        String jk = sc.next();
        String jl = sc.next();
        String rng = shijiang(kl,jk,jl,ass);
        System.out.println("你前世的名字是"+rng);
    }

    public static int zhuc(String a, int b,Xcx[] arr){
        Xcx x = new Xcx();
        x.yhm = a;
        x.mim = b;
        if (b<0){
            return -1;
        }
        for (int o = 0;o<arr.length;o++){
            if (arr[o] == null){
                arr[o] = x;
            }
        }return 1;
    }
    public static int dengl(String a,int b,Xcx[] arr){
        for (int i = 0;i<arr.length;i++){
            if (arr[i] != null){
                if (arr[i].yhm.equals(a) && arr[i].mim == b){
                    return 1;
                }else {
                    return -1;
                }
            }
        }return 1;
    }
    public static String shijiang(String a,String b,String c,Sxs[] ass){
        String kzc = "";
        for (int i = 0;i<ass.length;i++){
            if (ass[i] !=null){
                if (ass[i].lei.equals("生肖")){
                    if (ass[i].yuan.equals(a)){
                        kzc = kzc + ass[i].xin;
                    }
                }

                if (ass[i].lei.equals("月份")){
                    if (ass[i].yuan.equals(b)){
                        kzc = kzc + ass[i].xin;
                    }

                    if (ass[i].lei.equals("星座")){
                        if (ass[i].yuan.equals(c)){
                            kzc = kzc + ass[i].xin;
                        }
                    }
                }
            }
        }return kzc;
    }
}
