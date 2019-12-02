package com.MC.GT.RNG.FuWenDaLu;

public class Fu3 extends Fu2{
    static final String YS = "橙";
    private int ad;
    private int gs;

    public int getGs(){
        return gs;
    }

    public void setGs(int a){
        this.gs = a;
    }

    @Override
    public void shu() {
        System.out.println("ad"+this.ad);
    }
}
