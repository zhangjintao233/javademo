package com.DengLu.Demo.Demo;

import java.util.Scanner;
public class DengLu2 {
    static FuWen3[] ktt = new FuWen3[31];
    static FuWen4[] arr = new FuWen4[31];
    static FuWen5[] ass = new FuWen5[31];
    static renwu[] aee = new renwu[30];
    static DengLu[] aii = new DengLu[30];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DengLu gt = new DengLu();
        FuWen3 iq = new FuWen3();
        System.out.println("输入你要注册的用户名");
        String h2 = sc.next();
        gt.setYhm(h2);
        System.out.println("输入你要注册的密码");
        String h3 = sc.next();
        gt.setMim(h3);

        for (int i =1;i==1;){
        System.out.println("输入你的用户名");
        String h = sc.next();
        System.out.println("输入你的密码");
        String k = sc.next();
        DengLu x =kk(h,k,gt);
        if (x != null){
            System.out.println(gt.kzc());
            break;
        }else{
            System.out.println("你输入的用户名或密码不正确");

        }
        }
        int i =0;
        int k =0;
        int l =0;
        for(int ou = 1;ou==1;) {
            Scanner op = new Scanner(System.in);
//            System.out.println("请选择你想选的符文颜色");
            System.out.println("请选择橙色符文");
            rt();
            re(ktt);
//            kd(i, ktt);
            int zc = kd(i, ktt);

            System.out.println("请选择绿色符文");
            ou();
            oe(arr);
//            od(k, arr);
            int xc = od(k, arr);

            System.out.println("请选择蓝色符文");
            iu();
            ie(ass);
//            id(l, ass);
            int cc = id(l, ass);




            System.out.println("=====================");
            System.out.println("您的全部属性是:");
            System.out.println("攻击力是:" + zc);
            System.out.println("魔法攻击是:" + xc);
            System.out.println("生命值:" + cc);

            System.out.println("你确认符文吗？0代表确认，1代表重新选择符文");
            ou = op.nextInt();


            System.out.println("=====================");
            System.out.println("您的全部属性是:");
            System.out.println("攻击力是:" + zc);
            System.out.println("魔法攻击是:" + xc);
            System.out.println("生命值:" + cc);

        }
        System.out.println("我们不会保存你的信息，等你下次来是查看不了符文的");
    }



    public static DengLu kk(String a,String b,DengLu c){
        if (a.equals(c.getYhm()) && b.equals(c.getMim())){
            return c;
        }return null;
    }

    public static void rt(){
        FuWen3 x1 = new FuWen3("橙","白刃","1级","物理攻击",10);
        ktt[0] = x1;
        FuWen3 x2 = new FuWen3("橙","贪婪","2级","物理攻击",20);
        ktt[1] = x2;
        FuWen3 x3 = new FuWen3("橙","荆棘","3级","物理攻击",40);
        ktt[2] = x3;
        FuWen3 x4 = new FuWen3("橙","勇气","4级","物理攻击",70);
        ktt[3] = x4;
        FuWen3 x5 = new FuWen3("橙","无懈","5级","物理攻击",100);
        ktt[4] = x5;
        FuWen3 x6 = new FuWen3("橙","小白","1级","物理攻击",0);
        ktt[5] = x6;
        FuWen3 x7 = new FuWen3("橙","致命","2级","物理攻击",10);
        ktt[6] = x7;
        FuWen3 x8 = new FuWen3("橙","鬼斩","3级","物理攻击",10);
        ktt[7] = x8;
        FuWen3 x9 = new FuWen3("橙","尖锐","4级","物理攻击",20);
        ktt[8] = x9;
        FuWen3 x10 = new FuWen3("橙","审判","5级","物理攻击",100);
        ktt[9] = x10;
    }

    public static void re(FuWen3[] ktt){
        for (int i = 0;i<ktt.length;i++){
            if (ktt[i]!=null){
                System.out.println("===================");
                System.out.println(i);
                System.out.println("符文颜色:"+ktt[i].ys);
                System.out.println("符文名字:"+ktt[i].mz);
                System.out.println("符文等级:"+ktt[i].dj);
                System.out.println("符文属性:"+ktt[i].lx);
                System.out.println("符文加成:"+ktt[i].jc);
            }
        }
    }

    public static int kd(int y,FuWen3[] a){
        Scanner sc = new Scanner(System.in);
        if (a != null){
        for (int i = 0;i<10;i++){
            System.out.println("=================");
        System.out.println("请输入你选择的符文");
        int x = sc.nextInt();
        System.out.println("这是你选择的符文");
        System.out.println("");
        System.out.println("符文颜色:"+a[x].ys);
        System.out.println("符文名字:"+a[x].mz);
        System.out.println("符文等级:"+a[x].dj);
        System.out.println("符文类型:"+a[x].lx);
        System.out.println("符文加成:"+a[x].jc);
            y = y + a[x].jc;
            System.out.println("你目前的攻击加成是"+y);
        }
        }return y;
    }

    public static void ou(){
        FuWen4 x1 = new FuWen4("绿","鬼影","1级","魔法攻击",10);
        arr[0] = x1;
        FuWen4 x2 = new FuWen4("绿","定点","2级","魔法攻击",50);
        arr[1] = x2;
        FuWen4 x3 = new FuWen4("绿","束缚","3级","魔法攻击",80);
        arr[2] = x3;
        FuWen4 x4 = new FuWen4("绿","禁锢","4级","魔法攻击",100);
        arr[3] = x4;
        FuWen4 x5 = new FuWen4("绿","镜花水月","5级","魔法攻击",210);
        arr[4] = x5;
        FuWen4 x6 = new FuWen4("绿","漫步","1级","魔法攻击",30);
        arr[5] = x6;
        FuWen4 x7 = new FuWen4("绿","凯旋","2级","魔法攻击",10);
        arr[6] = x7;
        FuWen4 x8 = new FuWen4("绿","刺激","3级","魔法攻击",20);
        arr[7] = x8;
        FuWen4 x9 = new FuWen4("绿","自爆","4级","魔法攻击",30);
        arr[8] = x9;
        FuWen4 x10 = new FuWen4("绿","瞬狱影杀阵","5级","魔法攻击",30);
        arr[9] = x10;
    }

    public static void oe(FuWen4[] ktt){
        for (int i = 0;i<ktt.length;i++){
            if (ktt[i]!=null){
                System.out.println("===================");
                System.out.println(i);
                System.out.println("符文颜色:"+ktt[i].ys);
                System.out.println("符文名字:"+ktt[i].mz);
                System.out.println("符文等级:"+ktt[i].dj);
                System.out.println("符文属性:"+ktt[i].lx);
                System.out.println("符文加成:"+ktt[i].jc);
            }
        }
    }

    public static int od(int y,FuWen4[] a){
        Scanner sc = new Scanner(System.in);
        if (a!=null){
        for (int i = 0;i<10;i++){
            System.out.println("=================");
            System.out.println("请输入你选择的符文");
            int x = sc.nextInt();
            System.out.println("符文颜色:"+a[x].ys);
            System.out.println("符文名字:"+a[x].mz);
            System.out.println("符文等级:"+a[x].dj);
            System.out.println("符文类型:"+a[x].lx);
            System.out.println("符文加成:"+a[x].jc);
            y = y + a[x].jc;
            System.out.println("你目前的攻击加成是"+y);
        }
        }return y;
    }

    public static void iu(){
        FuWen5 x1 = new FuWen5("蓝","韧性","1级","生命值",50);
        ass[0] = x1;
        FuWen5 x2 = new FuWen5("蓝","抗性","2级","生命值",100);
        ass[1] = x2;
        FuWen5 x3 = new FuWen5("蓝","兴奋","3级","生命值",150);
        ass[2] = x3;
        FuWen5 x4 = new FuWen5("蓝","痛苦","4级","生命值",30);
        ass[3] = x4;
        FuWen5 x5 = new FuWen5("蓝","惊天","5级","生命值",500);
        ass[4] = x5;
        FuWen5 x6 = new FuWen5("蓝","护手","1级","生命值",80);
        ass[5] = x6;
        FuWen5 x7 = new FuWen5("蓝","狂徒","2级","生命值",100);
        ass[6] = x7;
        FuWen5 x8 = new FuWen5("蓝","日炎","4级","生命值",300);
        ass[7] = x8;
        FuWen5 x9 = new FuWen5("蓝","兰盾","5级","生命值",500);
        ass[8] = x9;
        FuWen5 x10 = new FuWen5("蓝","黑刃","3级","生命值",30);
        ass[9] = x10;
    }

    public static void ie(FuWen5[] ktt){
        for (int i = 0;i<ktt.length;i++){
            if (ktt[i]!=null){
                System.out.println("===================");
                System.out.println(i);
                System.out.println("符文颜色:"+ktt[i].ys);
                System.out.println("符文名字:"+ktt[i].mz);
                System.out.println("符文等级:"+ktt[i].dj);
                System.out.println("符文属性:"+ktt[i].lx);
                System.out.println("符文加成:"+ktt[i].jc);
            }
        }
    }

    public static int id(int y,FuWen5[] a){
        Scanner sc = new Scanner(System.in);
        if (a!=null){
            for (int i = 0;i<10;i++){
                System.out.println("=================");
                System.out.println("请输入你选择的符文");
                int x = sc.nextInt();
                System.out.println("符文颜色:"+a[x].ys);
                System.out.println("符文名字:"+a[x].mz);
                System.out.println("符文等级:"+a[x].dj);
                System.out.println("符文类型:"+a[x].lx);
                System.out.println("符文加成:"+a[x].jc);
                y = y + a[x].jc;
                System.out.println("你目前的攻击加成是"+y);
            }
        }return y;
    }
}
