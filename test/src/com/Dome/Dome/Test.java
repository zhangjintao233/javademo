package com.Dome.Dome;

public  abstract class Test {
    public String name = "fu";

    public Test(){
        System.out.println("这是父类的有参构造");
    }
    public abstract void gt();

    public void kk(){
        System.out.println("这是父类的普通方法");
    }
}
