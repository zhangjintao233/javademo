package com.sancenggouzao.dao;

import com.sancenggouzao.pojo.Users;

public class UserDao {
    private static Users[] arr;
    static {
        arr = new Users[10];
    }

    public Users xiangtong(String a){
        for (int i = 0;i<arr.length;i++){
            if (arr[i] != null){
                if (arr[i].getYhm().equals(a)){
                return arr[i];
                }
            }
        }return null;
    }

    public int cz(Users a){
        for (int i = 0;i<arr.length;i++){
            if (arr[i] == null){
                arr[i] = a;
                return 1;
            }
        }return 0;
    }

    public int dl(String a,String b){
        for (int i = 0;i<arr.length;i++){
            if (arr[i].getYhm().equals(a)){
                return 1;
            }
        }return -1;
    }
}
