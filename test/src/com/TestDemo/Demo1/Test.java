package com.TestDemo.Demo1;

import java.util.Scanner;
public class Test {
    String yhm;
    int mim;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Test[] arr = new Test[10];
        Demo2[] ass = new Demo2[36];
        Demo2 xc1 = new Demo2("生肖","鸡","苏");
        ass[0] = xc1;
        Demo2 xc2 = new Demo2("生肖","马","顾");
        ass[1] =xc2;
        Demo2 xc3 = new Demo2("生肖","羊","夏");
        ass[2] =xc3;
        Demo2 xc4 = new Demo2("生肖","兔","陌");
        ass[3] =xc4;
        Demo2 xc5 = new Demo2("生肖","龙","夜");
        ass[4] =xc5;
        Demo2 xc6 = new Demo2("生肖","鼠","上官");
        ass[5] =xc6;
        Demo2 xc7 = new Demo2("生肖","猪","慕");
        ass[6] =xc7;
        Demo2 xc8 = new Demo2("生肖","猴","楚");
        ass[7] =xc8;
        Demo2 xc9 = new Demo2("生肖","蛇","陆");
        ass[8] =xc9;
        Demo2 xc10 = new Demo2("生肖","狗","程");
        ass[9] =xc10;
        Demo2 xc11 = new Demo2("生肖","牛","浴");
        ass[10] =xc11;
        Demo2 xc12 = new Demo2("生肖","虎","玉");
        ass[11]=xc12;
        Demo2 xc13 = new Demo2("月份","1","小");
        ass[12] = xc13;
        Demo2 xc14 = new Demo2("月份","2","棂");
        ass[13] =xc14;
        Demo2 xc15 = new Demo2("月份","3","玥");
        ass[14] =xc15;
        Demo2 xc16 = new Demo2("月份","4","浅");
        ass[15] =xc16;
        Demo2 xc17 = new Demo2("月份","5","瑾");
        ass[16] =xc17;
        Demo2 xc18 = new Demo2("月份","6","颜");
        ass[17] =xc18;
        Demo2 xc19 = new Demo2("月份","7","曦");
        ass[18] =xc19;
        Demo2 xc20 = new Demo2("月份","8","夭");
        ass[19] =xc20;
        Demo2 xc21 = new Demo2("月份","9","眠");
        ass[20] =xc21;
        Demo2 xc22 = new Demo2("月份","10","晴");
        ass[21] =xc22;
        Demo2 xc23 = new Demo2("月份","11","莹");
        ass[22] =xc23;
        Demo2 xc24 = new Demo2("月份","12","瑶");
        ass[23]=xc24;
        Demo2 xc25 = new Demo2("星座","白羊座","浅");
        ass[24] = xc25;
        Demo2 xc26 = new Demo2("星座","金牛座","姬");
        ass[25] =xc26;
        Demo2 xc27 = new Demo2("星座","巨蟹座","盈");
        ass[26] =xc27;
        Demo2 xc28 = new Demo2("星座","天蝎座","晞");
        ass[27] =xc28;
        Demo2 xc29 = new Demo2("星座","摩羯座","蓉");
        ass[28] =xc29;
        Demo2 xc30 = new Demo2("星座","双子座","儿");
        ass[29] =xc30;
        Demo2 xc31 = new Demo2("星座","射手座","璃");
        ass[30] =xc31;
        Demo2 xc32 = new Demo2("星座","狮子座","衣");
        ass[31] =xc32;
        Demo2 xc33 = new Demo2("星座","处女座","仪");
        ass[32] =xc33;
        Demo2 xc34 = new Demo2("星座","天秤座","之");
        ass[33] =xc34;
        Demo2 xc35 = new Demo2("星座","双鱼座","绯");
        ass[34] =xc35;
        Demo2 xc36 = new Demo2("星座","水瓶座","色");
        ass[35]=xc36;
        String h =sc.next();
        int k =sc.nextInt();
        int kzc =zhuce(h,k,arr);

        if (kzc==1){
            System.out.println("注册成功");
        }else {
            System.out.println("注册失败");
        }

        System.out.println("请登录");
        String h2 = sc.next();
        int k2 = sc.nextInt();
        int xc =denglu(h2,k2,arr);
        if (xc ==1){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
            return;
        }
        System.out.println("请输入你的，生肖，月份，星座");
        String q = sc.next();
        String w = sc.next();
        String e =sc.next();
        String kzc2 =ceshi(q,w,e,ass);
        System.out.println(kzc2);
    }
    public static int zhuce(String h,int k,Test[] arr){
        Test x = new Test();
        x.yhm = h;
        x.mim =k;

        if (k < 0 || k < 0){
            return -1;
        }
        for (int o = 0;0<arr.length;o++){
            if (arr[o] ==null){
                arr[o]=x;
                return 1;

            }
        }return 1;
    }
    public static int  denglu(String h2,int k2,Test[] arr){
        for (int i = 0;i<arr.length;i++){
            if (arr[i] != null){
                if (arr[i].yhm.equals(h2) && arr[i].mim == k2){
                    return 1;
                }
            }
        }return -1;
    }
    public static String ceshi(String x,String y,String l,Demo2[] ass){
        String kzc2 ="";
        for (int i = 0;i<ass.length;i++) {
            if (ass[i] != null) {
                if (ass[i].leix.equals("生肖"))
                    if (ass[i].yuanz.equals(x)) {
                        kzc2 = kzc2 + ass[i].xinz;
                    }

                if (ass[i].leix.equals("月份")) {
                    if (ass[i].yuanz.equals(y)) {
                        kzc2 = kzc2 + ass[i].xinz;
                    }
                }

                if (ass[i].leix.equals("星座")) {
                    if (ass[i].yuanz.equals(l)) {
                        kzc2 = kzc2 + ass[i].xinz;
                    }
                }
            }

        }
        return kzc2;
    }
}