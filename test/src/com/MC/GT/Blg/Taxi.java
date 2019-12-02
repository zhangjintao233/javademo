package com.MC.GT.Blg;

public class Taxi extends Car{
    String company;

    public Taxi(){

    }

//    public Taxi(String userName, String color,String company){
//        super(userName,color);
//        this.company = company;
//    }


     public final void ride(){
        System.out.println(userName+"的出租车是所属于在"+company+"公司的");
    }

    public void use(){
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    public String toString(){
        System.out.println("taxi的信息是:"+userName+"一辆"+color+"汽车");
        return null;
    }
}
