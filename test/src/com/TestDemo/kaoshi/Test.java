package com.TestDemo.kaoshi;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;
public class Test {
    String x;
    String y;
    String a;
    int s;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Test[] arr = new Test[10];
        System.out.println("请输入你的姓名");
        String zx = sc.next();
        System.out.println("请输入你的门派");
        String zxc = sc.next();
        System.out.println("请输入你的性别");
        String cxz = sc.next();
        System.out.println("请输入你的年龄");
        int xz = sc.nextInt();

        int x = shur(zx,zxc,cxz,xz,arr);
        if (x == 1){
            System.out.println("欢迎进入灵境");
        }else{
            System.out.println("你不能进入灵境");
            return;
        }

        Test2[] ass = new Test2[100];
        Test2 xc1 = new Test2();
        xc1.wuxing="金";
        xc1.mingzi="小金";
        xc1.shuxing="拥有金色皮肤";
        xc1.dengji="A级";
        xc1.duyoujineng="能变成金块";
        Test2 xc2 = new Test2();
        xc2.wuxing="木";
        xc2.mingzi="小木";
        xc2.shuxing="拥有绿色皮肤";
        xc2.dengji="A级";
        xc2.duyoujineng="能变成大树";
        Test2 xc3 = new Test2();
        xc3.wuxing="水";
        xc3.mingzi="小水";
        xc3.shuxing="拥有蓝色皮肤";
        xc3.dengji="A级";
        xc3.duyoujineng="能变成水";
        Test2 xc4 = new Test2();
        xc4.wuxing="火";
        xc4.mingzi="小火";
        xc4.shuxing="拥有红色皮肤";
        xc4.dengji="A级";
        xc4.duyoujineng="能变成火";
        Test2 xc5 =new Test2();
        xc5.wuxing="土";
        xc5.mingzi="小土";
        xc5.shuxing="拥有很多土";
        xc5.dengji="S级";
        xc5.duyoujineng="能变成土";
        ass[0] = xc1;
        ass[1] = xc2;
        ass[2] = xc3;
        ass[3] = xc4;
        ass[4] = xc5;
        for (int o =0;o==0;){
            for (int i = 0;i<ass.length;i++){
                if (ass[i] != null){
                    System.out.println("====================");
                    System.out.println("宠物序号是:"+i);
                    System.out.println("宠物五行是:"+ass[i].wuxing);
                    System.out.println("宠物名字是:"+ass[i].mingzi);
                    System.out.println("宠物属性是:"+ass[i].shuxing);
                    System.out.println("宠物等级是:"+ass[i].dengji);
                    System.out.println("宠物独有技能是:"+ass[i].duyoujineng);
                }
            }
            System.out.println("请输入你选择的灵兽");
            int a = sc.nextInt();
            System.out.println("=======================");
            if (a<ass.length){
                System.out.println("宠物序号是:"+a);
                System.out.println("宠物五行是:"+ass[a].wuxing);
                System.out.println("宠物名字是:"+ass[a].mingzi);
                System.out.println("宠物属性是:"+ass[a].shuxing);
                System.out.println("宠物等级是:"+ass[a].dengji);
                System.out.println("宠物独有技能是:"+ass[a].duyoujineng);
            }else {
                System.out.println("你输入的宠物不存在");
            }
            System.out.println("必须回答我的问题，正确我就是你的了");
            System.out.println("灵兽:你是帅哥吗？1代表是，0代表不是");
            int ls = sc.nextInt();
            if (ls==1){
                System.out.println("回答正确");
                System.out.println("恭喜你获得此灵兽");
                System.out.println("离开灵境");
                return;
            }
            if (ls !=1){
                System.out.println("回答错误，请输入0重新选择宠物");
                o=sc.nextInt();
            }
        }

    }



    public static int shur(String a,String b,String c,int d,Test[] arr){
        Test x = new Test();
        x.x = a;
        x.y = b;
        x.a = c;
        x.s = d;
        for (int i = 0;i<arr.length;i++){
            if (d<10 || d>30){
                return -1;
            }else if (arr[i] != null){
                arr[i] = x;
            }
        }return 1;
    }
}








