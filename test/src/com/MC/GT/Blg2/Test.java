package com.MC.GT.Blg2;

public class Test {

    public static void main(String[] args){
        Car xc = new Car();
        Car xc2 = new Car();
        xc.use();
        System.out.println("xc和xc2的引用比较:");
        Taxi kc = new Taxi("长生");
        System.out.println("=============================");
        kc.ride();
        kc.use();
        kc.toString();
        HomeCar hh = new HomeCar(7);
        System.out.println("=============================");
        hh.display();
        hh.display(5);


    }
}
