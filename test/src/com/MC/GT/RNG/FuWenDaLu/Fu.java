package com.MC.GT.RNG.FuWenDaLu;

public class Fu {
    public static void main(String[] args){

        Fu2[] arr = new Fu2[93];


        Fu2 vb = new Fu3();
        Fu3 o = (Fu3) vb;
        o.setGs(10000);
        Fu4 vb2 = new Fu4();
        vb2.setSm(100);
        Fu5 vb3 = new Fu5();
        vb3.setCd(100);

        arr[0] = vb;
        arr[1] = vb2;
        arr[2] = vb3;

        for (int i = 0;i<arr.length;i++){
            if (arr[i] != null){
                if (arr[i] instanceof Fu3){
                    Fu3 o2 = new Fu3();
                    System.out.println(o2.getGs());
                }else if (arr[i] instanceof Fu4){
                    Fu4 o3 = new Fu4();
                    System.out.println(o3.getSm());
                }else if (arr[i] instanceof Fu5){
                    Fu5 o4 = new Fu5();
                    System.out.println(o4.getCd());
                }




            }
        }
    }
}
