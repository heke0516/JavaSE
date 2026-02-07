package com.itheima.singleInstance;

public class A {
    //2、定义一个静态变量，用于记录本类的唯一一个对象
    private static A a = new A();
    //饿汉式单例：拿对象时，对象已经创建好了


    //1、私有化构造方法
    private A() {}

    //3、定义一个静态方法，返回唯一一个对象
    public static A getInstance() {
        return a;
    }
}
