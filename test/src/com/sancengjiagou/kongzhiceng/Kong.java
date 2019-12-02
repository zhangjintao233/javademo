package com.sancengjiagou.kongzhiceng;

import com.sancengjiagou.yewuceng.Ye;

public class Kong {
    private Ye y = new Ye();

    public String nb(String a,String b){
        String c =y.zhuce(a,b);
        return c;
    }
    public String f(String a,String b){
        String g = y.denglu(a, b);
        return g;
    }


    public int chongzhi(int a){
        int i = y.chonzhi(a);
        return i;
    }
}
