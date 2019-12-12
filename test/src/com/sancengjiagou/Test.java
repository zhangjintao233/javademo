package com.sancengjiagou;

import com.sancengjiagou.kongzhiceng.Kong;
import com.sancengjiagou.shujuceng.Shu;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kong tt = new Kong();
        Shu rr = new Shu();
        System.out.println("欢迎来到233年一次的万界拍卖会");
        er:
        for (;;) {
            System.out.println("1代表注册,2代表登录,9代表离开");
            int hh = sc.nextInt();
            switch (hh) {
                case 1:
                    System.out.println("请输入你要注册的用户名");
                    String h = sc.next();
                    System.out.println("请输入你要注册密码");
                    String h2 = sc.next();
                    String kzc = tt.nb(h, h2);
                    System.out.println(kzc);
                    break;
                case 2:
                    int o = 0;
                    System.out.println("请输入你要登录的用户名");
                    String h3 = sc.next();
                    System.out.println("输入你要登录的密码");
                    String h4 = sc.next();
                    String xc = tt.f(h3, h4);
                    if (xc == "登录成功") {
                        System.out.println(xc);
                        System.out.println("你的用户名为:" + h3);
                        System.out.println("你的密码为:" + h4);
                        System.out.println("你的金额为:" + 0);
                        System.out.println("你的身份是:小白");
                        break er;
                    } else {
                        System.out.println(xc);
                    }
                    break;
                case 9:
                    return;
            }
        }
        System.out.println("=================================================================================================");
        System.out.println("欢迎来到拍卖场首页");
        for (int i = 0; i < 2; ) {
            System.out.println("=================================================================================================");
            System.out.println("《拍卖法》第四十六条规定：“拍卖公告应当通过报纸或者其他新闻媒介发布”。");
            System.out.println("《拍卖法》第四十八条规定：“拍卖人应当在拍卖前展示拍卖标的，并提供查看拍卖标的的条件及有关资料。拍卖标的的展示时间不得少于两日。”");
            System.out.println("1.展示商品,2.搜索商品,3.选择上架的商品,4.拍卖场排行榜,5.购物车,6.充值系统,7.查看我拍卖的物品,8.查看我的百宝囊,9.离开");
            int t = sc.nextInt();
            switch (t) {
                case 1:
                    rr.wuping();
                    break;
                case 2:
                    rr.chazhao();
                    break;
                case 3:
                    rr.shangjia();
                    break;
                case 4:
                    rr.jiage();
                    break;
                case 5:
                    rr.gouwuche();
                    break;
                case 6:
                    System.out.println("输入你要充值的金额");
                    int h5 = sc.nextInt();
                    int j = tt.chongzhi(h5);
                    if (j != -1) {
                        System.out.println("充值成功");
                        System.out.println("你的金额为:"+j );
                        if (j >= 500 && j<=799) {
                            System.out.println("你的身份为:土豪");
                        } else if (j >= 800 && j<= 999) {
                            System.out.println("你的身份为:富豪");
                        } else if (j >= 1000) {
                            System.out.println("你的身份为:首富");
                        }
                    } else {
                        System.out.println("充值失败");
                        System.out.println("你的金额为:" + rr.getAee());
                    }
                    break;
                case 7:
                    rr.ziji();
                    break;
                case 8:
                    rr.baibaoxiang();
                    break;
                case 9:
                    System.out.println("谢谢惠顾，欢迎下来光临");
                    return;
            }
        }

    }
}