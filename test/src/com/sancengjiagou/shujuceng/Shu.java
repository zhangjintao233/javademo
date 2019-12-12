package com.sancengjiagou.shujuceng;

import com.sancengjiagou.yonghu.shangpin;
import com.sancengjiagou.yonghu.Users;

import java.util.Scanner;

public class Shu {
    Scanner sc = new Scanner(System.in);
    private static Users[] hh;
    private static int[] aee;
    private static shangpin[] arr;
    private static String[] ass;
    private static int[] aww;
    private static String[] att;
    private static String[] aoo;

    static {
        hh = new Users[10];
        aee = new int[1];
        arr = new shangpin[20];
        ass = new String[10];
        att = new String[10];
        aww = new int[1];
        aoo = new String[10];
    }

    public int fr(Users a) {
        for (int i = 0; i < hh.length; i++) {
            if (hh[i] == null) {
                hh[i] = a;
                return 1;
            }
        }
        return -1;
    }


    public Users xt(String a, String b) {
        for (int i = 0; i < hh.length; i++) {
            if (hh[i] != null) {
                if (hh[i].getYhm().equals(a)) {
                    return hh[i];
                }
            }
        }
        return null;
    }

    public int bj(String a, String b) {
        for (int i = 0; i < hh.length; i++) {
            if (hh[i] != null) {
                if (hh[i].getYhm().equals(a) && hh[i].getMim().equals(b)) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public int chongzhi(int a) {
        if (a > 0 && a <= 100) {
        aee[0] = aee[0] + a;
        return aee[0];
        }
        return -1;
    }

    public void wuping() {
        shangpin xc = new shangpin("无尽之刃", "攻击性", "长剑", "暴击伤害翻倍", 200);
        arr[0] = xc;
        shangpin xc1 = new shangpin("饮血剑", "攻击性", "长剑", "百分之20的生命偷取", 185);
        arr[1] = xc1;
        shangpin xc2 = new shangpin("最后的轻语", "攻击性", "弓", "百分之45的护甲穿透。", 165);
        arr[2] = xc2;
        shangpin xc3 = new shangpin("狂徒铠甲", "防御性", "铠甲", "脱离战斗10秒后，每秒回复你最大生命值的百分之8.6。", 180);
        arr[3] = xc3;
        shangpin xc4 = new shangpin("号令之旗", "功能性", "旗帜", "极大提升一个线上小兵的威力(120秒冷却时间)。晋升过的小兵会获得特殊加成属性。", 120);
        arr[4] = xc4;
        shangpin xc5 = new shangpin("干扰水晶", "功能性", "法杖", "阻止附近的敌方防御塔进行攻击，持续3秒(冷却时间：120秒)。该效果在8秒里仅能对同一防御塔使用一次。", 130);
        arr[5] = xc5;
        shangpin xc6 = new shangpin("钢铁合剂", "功能性", "饮品", "提供+300生命值，25%韧性，并提升英雄体型，以及钢铁之路，持续3分钟。钢铁之路：移动时会在身后留下一条道路，友方英雄在这条道路上会提升15%移动速度。(同一时间只能存在一种合剂效果。)", 50);
        arr[6] = xc6;
        shangpin xc7 = new shangpin("荆棘之甲", "防御性", "铠甲", "被普通攻击命中时，会回敬给攻击者魔法伤害，数额相当于你10%的额外护甲值加上25，并对攻击者施加重伤效果，持续1秒。", 140);
        arr[7] = xc7;
        shangpin xc8 = new shangpin("兰德里的折磨", "攻击性", "面具", "在与英雄作战时，每过1秒，你造成的伤害就会多2%(最大值：10%)。", 115);
        arr[8] = xc8;
        shangpin xc9 = new shangpin("智慧末刃", "攻击性", "单剑", "你的普通攻击造成42额外魔法伤害。", 135);
        arr[9] = xc9;
        shangpin xc10 = new shangpin("水银弯刀", "攻击性", "长刀", "移除你英雄身上的所有控制效果，并提供50%移动速度加成，持续1秒(冷却时间：90秒)。", 170);
        arr[10] = xc10;
        shangpin xc11 = new shangpin("卢安娜的飓风", "攻击性", "弓", "你的普通攻击会朝2个附近的目标发射微型弩箭，每支弩箭造成(40%攻击力)的物理伤害。这些弩箭能够暴击和附带攻击特效。", 155);
        arr[11] = xc11;
        shangpin xc12 = new shangpin("鬼索的狂暴之刃", "攻击性", "鬼刀", "每次普通攻击提供+8%攻击速度、+4%额外攻击力和+4%法术强度，持续5秒(最多可叠6层)。在满层时，提供鬼索之怒效果。鬼索之怒：每隔一次普攻将触发两次攻击特效。在层数到达一半时，近战英雄的下次攻击将直接叠至满层效果。", 190);
        arr[12] = xc12;
        shangpin xc13 = new shangpin("德拉克萨的暮刃", "攻击性", "匕首", "在脱离敌方视野至少1秒以后，你的下次对敌方英雄发起的普攻将在命中时造成30 - 200额外物理伤害并使该英雄减速99%，持续0.25秒。远程攻击造成30 - 200伤害，并且不施加减速效果。(在被一名敌方英雄看见后，可持续5秒)。", 150);
        arr[13] = xc13;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println("============================");
                System.out.println("物品序号为:" + i);
                System.out.println("物品名字为:" + arr[i].mz);
                System.out.println("物品属性为:" + arr[i].sx);
                System.out.println("物品类型为:" + arr[i].lx);
                System.out.println("物品类型为:" + arr[i].jg);
            }
        }
        int m = 0;
        kktv:
        for (int i = 0; i < ass.length; i++) {
            System.out.println("输入你想查看的物品的序号");
            int h = sc.nextInt();
            System.out.println("============================");
            System.out.println("物品名字为:" + arr[h].mz);
            System.out.println("物品属性为:" + arr[h].sx);
            System.out.println("物品类型为:" + arr[h].lx);
            System.out.println("物品功能为:" + arr[h].gn);
            System.out.println("物品类型为:" + arr[h].jg);
            System.out.println("============================");
            System.out.println("你是否要放入购物车？1.确认放入,2.在看看");
            int as = sc.nextInt();
            if (as != 1) {
                break kktv;
            }
            System.out.println("============================");
            System.out.println("物品名字为:" + arr[h].mz);
            System.out.println("物品属性为:" + arr[h].sx);
            System.out.println("物品类型为:" + arr[h].lx);
            System.out.println("物品功能为:" + arr[h].gn);
            System.out.println("物品价格为:" + arr[h].jg);
            System.out.println("============================");
            m = m + arr[i].jg;
            tg:
            for (int t = 0; t < ass.length; t++) {
                if (ass[t] == null) {
                    ass[t] = arr[h].mz;
                    break tg;
                }
            }
            aww[0] = aww[0] + arr[h].jg;
            System.out.println("你还要继续购买吗？1.继续,2.停止");
            int u = sc.nextInt();
            if (u != 1) {
                return;
            }
        }
    }

    public void gouwuche() {
        System.out.println("============================");
        for (int x = 0; x < ass.length; x++) {
            if (ass[x] != null) {
                System.out.println("物品名字为:" + ass[x]);
            } else {
                System.out.println("商品为:" + null);
            }
        }
        System.out.println("你是否要结算购物车，1.是，2.不是");
        int i = sc.nextInt();
        if (i == 1) {
            if (aee[0] >= aww[0]) {
                aoo[0] = ass[0];
                aoo[1] = ass[1];
                aoo[2] = ass[2];
                aoo[3] = ass[3];
                aoo[4] = ass[4];
                aoo[5] = ass[5];
                aoo[6] = ass[6];
                aoo[7] = ass[7];
                aoo[8] = ass[8];
                aoo[9] = ass[9];
                aee[0] = aee[0] - aww[0];
                ass[0] = null;
                ass[1] = null;
                ass[2] = null;
                ass[3] = null;
                ass[4] = null;
                ass[5] = null;
                ass[6] = null;
                ass[7] = null;
                ass[8] = null;
                ass[9] = null;
                System.out.println("你的物品以及全部放入百宝囊");
                System.out.println("你的余额为:" + aee[0]);
                System.out.println("欢迎下次光临");
            } else {
                System.out.println("你的余额不足，请充值");
            }
        }

    }

    public void jiage() {
        int x = 0;
        for (int i = 200; i > 0; i--) {
            if (arr[0].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[0].mz + "。" + "物品价格为:" + arr[0].jg);
            } else if (arr[1].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[1].mz + "。" + "物品价格为:" + arr[1].jg);
            } else if (arr[2].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[2].mz + "。" + "物品价格为:" + arr[2].jg);
            } else if (arr[3].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[3].mz + "。" + "物品价格为:" + arr[3].jg);
            } else if (arr[4].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[4].mz + "。" + "物品价格为:" + arr[4].jg);
            } else if (arr[5].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[5].mz + "。" + "物品价格为:" + arr[5].jg);
            } else if (arr[6].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[6].mz + "。" + "物品价格为:" + arr[6].jg);
            } else if (arr[7].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[7].mz + "。" + "物品价格为:" + arr[7].jg);
            } else if (arr[8].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[8].mz + "。" + "物品价格为:" + arr[8].jg);
            } else if (arr[9].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[9].mz + "。" + "物品价格为:" + arr[9].jg);
            } else if (arr[10].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[10].mz + "。" + "物品价格为:" + arr[10].jg);
            } else if (arr[11].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[11].mz + "。" + "物品价格为:" + arr[11].jg);
            } else if (arr[12].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[12].mz + "。" + "物品价格为:" + arr[12].jg);
            } else if (arr[13].jg == i) {
                x++;
                System.out.println("物品排行为:" + x + "。" + "物品名字为:" + arr[13].mz + "。" + "物品价格为:" + arr[13].jg);
            }
        }
    }


    public void shangjia() {
        if (aee[0] >= 500) {
            for (int i = 0; i < aoo.length; i++) {
                System.out.println("========================");
                System.out.println("物品序号为:0。" + aoo[0]);
                System.out.println("物品序号为:1。" + aoo[1]);
                System.out.println("物品序号为:2。" + aoo[2]);
                System.out.println("物品序号为:3。" + aoo[3]);
                System.out.println("物品序号为:4。" + aoo[4]);
                System.out.println("物品序号为:5。" + aoo[5]);
                System.out.println("物品序号为:6。" + aoo[6]);
                System.out.println("物品序号为:7。" + aoo[7]);
                System.out.println("物品序号为:8。" + aoo[8]);
                System.out.println("物品序号为:9。" + aoo[9]);
                System.out.println("========================");
                System.out.println("输入你想要上架的商品序号.11.返回");
                int h = sc.nextInt();
                if (h == 11) {
                    return;
                } else {
                    if (aoo[h] != null) {
                        att[h] = aoo[h];
                        System.out.println("物品序号为:" + h + "。" + att[h]);
                        System.out.println("========================");
                        aoo[h] = null;
                    } else {
                        System.out.println("你没有可以上架的物品");
                    }

                }
                System.out.println("你是否还要继续上架。1.上架，2.停止");
                int h2 = sc.nextInt();
                if (h2 != 1) {
                    return;
                }
            }
        } else {
            System.out.println("你的余额不足500元，请充值后，再来拍卖");
        }

    }

    public void ziji() {
        for (int y = 0; y < att.length; y++) {
            if (arr[y] != null) {
                System.out.println("商品序号为:" + y + "。" + att[y]);
            } else {
                System.out.println("商品为:" + null);
            }
        }

        System.out.println("你要取消上架物品吗？1.是。2.不是");
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("输入你要取消上架物品的序号");
            int x = sc.nextInt();
            if (att[x] != null) {
                aoo[x] = att[x];
                att[x] = null;
            } else if (i == 2) {
                return;
            } else {
                System.out.println("这个位置没有你的物品");
            }
        }
        return;
    }

    public void baibaoxiang() {
        for (int i = 0; i < aoo.length; i++) {
            if (aoo[i] != null) {
                System.out.println("商品为:" + aoo[i]);
            } else {
                System.out.println("商品为:" + null);
            }
        }
    }

    public void chazhao() {
        System.out.println("输入你要查询装备的名字");
        String h = sc.next();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (h.equals(arr[i].mz)) {
                    System.out.println("物品名字为:" + arr[i].mz);
                    System.out.println("物品属性为:" + arr[i].sx);
                    System.out.println("物品类型为:" + arr[i].lx);
                    System.out.println("物品功能为:" + arr[i].gn);
                    System.out.println("物品价格为:" + arr[i].jg);
                    return;
                }
            } else {
                System.out.println("你输入的物品不存在");
                return;
            }
        }

    }

    public int getAee() {
        return aee[0];
    }
}