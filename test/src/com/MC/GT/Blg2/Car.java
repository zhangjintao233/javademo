package com.MC.GT.Blg2;

public class Car {
    String color;
    String userName ;

    public Car(){

    }

    public Car(String a,String b){
        this.color = a;
        this.userName = b;
    }

    public  void use(){
        System.out.println("我是机动车！");
    }

}
