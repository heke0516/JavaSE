package com.itheima.singleInstance;

public class B {
    //懒汉式单例类：需要对象的时候才开始创建对象
    private static B b;  //私有化静态变量

    //私有化构造器
    private B() {}

    //提供静态方法返回对象
    public static B getInstance() {
        if(b == null) {
            //第一次拿对象时，会创建对象，给静态变量b记住
            b = new B();
        }
        return b;
    }
}
