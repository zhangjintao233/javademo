package com.MC.GT.Blg2;

public class Taxi extends Car{
    String company;



    public Taxi(String company){
        super("蓝色","张小泉");
    }

    public final void ride(){
        System.out.println(userName+"出租车是所属于在"+company+"公司的");
    }
    public void use(){
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    public String toString(){
        System.out.println("taxi的信息是:"+userName+"一辆"+color+"汽车");
        return null;
    }
}
