package com.MC.GT.WE;

import com.MC.GT.Blg.Car;

import java.util.Scanner;
public class Pmc2 {
    static Yhm f = new Yhm();
    static Pmc[] arr = new Pmc[10];
    static Pmc kzc = new Pmc();

    static String[] ass = new String[10];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pmc xc = new Pmc();
        System.out.println("欢迎来到每233年举办一次的万界拍卖会");
        for2:for (int i = 0;i<10;){
            System.out.println("1代表注册，2代表登录");
            System.out.println("请输入数字");
            int j = sc.nextInt();
            if (j <= 10){
                switch (j){
                    case 1:
                        int g = xt();
                        if (g != 1){
                            System.out.println("你输入的用户名已存在");
                        }else {
                            System.out.println("注册成功");
                        }
                        break;
                    case 2:
                        int g2 = dl();
                        if (g2 == 1){
                            break for2;
                        }

                }
            }else {
                System.out.println("你输入的数字有误，请重新输入");
            }
        }

            kzc.chongzhi();
    }

    public static int xt(){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要注册的用户名");
        String h = sc.next();
        f.setYhm(h);
        System.out.println("请输入你要注册密码");
        String h2 = sc.next();
        f.setMim(h2);
        for (int i = 0;i<ass.length;i++){
            if (ass[i] == null){
                ass[i] = f.getYhm();
                return 1;
            }
            if (ass[i] != null){
                if (ass[i].equals(f.getYhm())){
                    return -1;
                }
            }
        }return 1;
    }

    public static int dl(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的用户名");
        String k = sc.next();
        System.out.println("请输入你的密码");
        String k2 = sc.next();

        int u = dlb(k,k2,ass);
        if (u == 1){
            System.out.println("登录成功");
            System.out.println("你的余额:"+0);
            return 1;
        }else{
            System.out.println("你输入的用户名或密码不正确");
        }return -1;
    }

    public static int dlb(String a,String b,String[] c){
        for (int i = 0;i<c.length;i++){
            if (a.equals(c[i]) && b.equals(c[i])){
                return 1;
            }
        }return -1;
    }


}
