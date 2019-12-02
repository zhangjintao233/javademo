package com.DengLu.Demo.Demo;

public class DengLu {
    private String yhm;
    private String mim;

    public void setYhm(String a){
        this.yhm = a;
    }
    public String getYhm(){
        return yhm;
    }
    public void setMim(String a){
        this.mim = a;
    }
    public String getMim(){
        return mim;
    }
    public String kzc(){
        String s = "用户名:"+this.getYhm()+"密码"+this.getMim();
        return s;
    }
    public DengLu(){

    }
    public  DengLu(int a,int b,int c){

    }

}
