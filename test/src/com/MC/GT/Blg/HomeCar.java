package com.MC.GT.Blg;

public class HomeCar extends Car{
     int num;

     public HomeCar(int i){
//         super("孙二娘","red");
         this.num = i;
     }


    public void display(){
        System.out.println(userName+"拥有的"+color+"颜色的私家车有"+num+"个座位");
    }

    public void display(int num){
        System.out.println("家用汽车大多有"+num+"个座位");
    }


}
