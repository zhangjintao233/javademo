package com.MC.GT.Blg;

public class Test {
    public static void main(String[] args){


        Car xc = new Car("123","1");
        Car xc2 = new Car("123","1");
        xc.use();
        System.out.println("xc和xc2的引用比较:"+(xc.color.equals(xc2.color)&&xc.userName.equals(xc2.userName)));
        Taxi bb = new Taxi();
        System.out.println("=======================================");
        bb.userName = "张小泉";
        bb.company = "长生";
        bb.color= "蓝色";
        bb.ride();
        bb.use();
        bb.toString();
        HomeCar kzc = new HomeCar(7);
        System.out.println("==============================");
        kzc.userName = "孙二娘";
        kzc.color = "紫色";
        kzc.display();
        kzc.display(5);



    }
}
