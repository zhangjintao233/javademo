package com.sancengjiagou.shujuceng;

import com.sancengjiagou.yonghu.Users2;

public class UserDao {
    private static Users2[] arr;

    static {
        arr = new Users2[10];
    }


    public int jinru(Users2 a){
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == null){
                arr[i] = a;
                return 1;
            }
        }return -1;
    }
}
