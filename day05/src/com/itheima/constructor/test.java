package com.itheima.constructor;

public class test {
    public static void main(String[] args) {
        //认识类的构造器
        Student s1 = new Student();  //创建对象时，对象会去自动调用构造器（构造方法）

        Student s2 = new Student("张三");  //创建对象时，对象会去自动调用构造器（构造方法）
    }
}
