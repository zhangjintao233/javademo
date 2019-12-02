package com.sanchengjiagou.dao;

import com.sanchengjiagou.pojo.Users;

//用户数据层
public class UserDao {
    private static Users[] mz;

    static {
        mz = new Users[10];
    }

    public Users xiangtong(String a){
        for(int i = 0;i<mz.length;i++){
            if (mz[i] != null){
                if (mz[i].getUname().equals(a))
                    return mz[i];
            }
        }return null;
    }


    public int cz(Users a){
        for (int i = 0;i<mz.length;i++){
            if (mz[i] == null){
                mz[i] = a;
                return 1;
            }
        }return 0;
    }
}
