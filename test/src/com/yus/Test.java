package com.yus;

public class Test {
    public static void main(String[] args){
        Test s1 = new Test();
        System.out.println(s1.hashCode());
        Test s2 = new Test();
        System.out.println(s2.hashCode());
        Test s3 = new Test();
        System.out.println(s3.hashCode());
        System.out.println("----------------");

        Test x = new Test();
        Class c = x.getClass();
        String kzc = c.getName();
        System.out.println(kzc);


        String kzc2 =  x.getClass().getName();
        System.out.println(kzc2);
    }
}
