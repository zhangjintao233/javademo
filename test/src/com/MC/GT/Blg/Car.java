package com.MC.GT.Blg;

import java.util.Objects;

public class Car {
      String color ;
      String userName ;


    public Car(){}


    public Car(String userName,String color){
        this.userName=userName;
        this.color=color;
    }

    public void use(){
        System.out.println("我是机动车");


    }
}

