package com.itheima.staticDemo;

public class User {
    //规范：如果这个方法只是为了做一个功能且不需要直接访问对象的数据，那么这个方法就可以定义为静态方法
    //静态方法：有static修饰符，属于类持有
    public static void print(){
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
    }

    //实例方法：无static修饰符，属于对象持有
    public void show(){
        System.out.println("show");
        System.out.println("show");
        System.out.println("show");
    }
}
