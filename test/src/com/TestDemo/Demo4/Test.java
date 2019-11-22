package com.TestDemo.Demo4;

import java.util.Scanner;
public class Test {
    static Test2[] ass = new  Test2[100];

    static String[] arr = new String[5];
    static int[] arr2 = new int[5];
    static{
        arr[0]="java";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String mz = sc.next();
        System.out.println("请输入门派");
        String mp = sc.next();
        System.out.println("请输入性别");
        String xb = sc.next();
        System.out.println("请输入年龄");
        int h = sc.nextInt();

        Test2 xc = new Test2(mz,mp,xb,h);
        int i2 =jilu(xc,ass);


        int i3 =renshu(xc,arr,arr2);
        if (i3 == 1){
        }else {
            System.out.println("这个门派人满了");
            return;
        }



        int i = denglu(new Test2(mz,mp,xb,h));
        if (i==1){
            System.out.println("欢迎来到灵境");
        }else {
            System.out.println("你不能来的灵境");
        }

    }
    public static int denglu(Test2 a){
        if (a != null){
            if (a.nianl < 10  &&  a.nianl>30){
                return -1;
            }
        }return 1;
    }

    public static int jilu(Test2 a,Test2[] arr){
        for (int i = 0;i<arr.length;i++){
            if (arr[i] != null) {
                if (arr[i].xingm.equals(a.xingm)){
                    return -1;
                }
            }
        }
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == null ){
                arr[i]=a;
                return 1;
            }
        }return -1;
    }
    public static int renshu(Test2 a,String[] q,int[] w){
        if (a != null){
            for (int i = 0;i<q.length;i++){
                if (q[i] != null && q[i].equals(a.menpai)){
                    if (w[i] < 10){
                        w[i]++;
                        return 1;
                    }
                }
            }
        }return -1;
    }
}

