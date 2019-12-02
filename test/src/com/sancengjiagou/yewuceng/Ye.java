package com.sancengjiagou.yewuceng;

import com.sancengjiagou.shujuceng.Shu;
import com.sancengjiagou.yonghu.Users;
import com.sancengjiagou.yonghu.shangpin;

public class Ye {
    private Shu s = new Shu();
    private Users r = new Users();
    private shangpin p = new shangpin();
    //注册方法
    public String zhuce(String a,String b){
        if (a != null && b != null){
            Users v = s.xt(a,b);
            if (v != null){
                return "你输入的用户名已存在";
            }
        }



        r.setYhm(a);
        r.setMim(b);
        int i = s.fr(r);
        if (i == 1){
            return "注册成功";
        }
        return "注册失败";
    }
    //登录方法
    public String denglu(String a,String b){
        int i = s.bj(a,b);
        if (i == 1){
            return "登录成功";
        }return "登录失败";
    }
    //    充值方法
    public int chonzhi(int a){
        int u = s.chongzhi(a);
        return u;
    }
}
