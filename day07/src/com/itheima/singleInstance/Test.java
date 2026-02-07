package com.itheima.singleInstance;

public class Test {
    public static void main(String[] args) {
        //目标：设计单例类，确保一个类只能创建一个对象
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        System.out.println(a1);  //com.itheima.singleInstance.A@1b6d3586
        System.out.println(a2);
        System.out.println(a1 == a2);  //true

        System.out.println("===================");
        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);

    }
}
