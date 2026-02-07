package com.itheima.interface4;

public class Test {
    public static void main(String[] args) {
        //理解接口的几点注意事项
        //2、一个接口继承多个接口，如果多个接口中有同名方法，则接口的抽象方法必须重写
        C1 c = new C1();
        c.show();
    }
}
//1、接口与接口可以多继承，一个接口可以继承多个接口
//类与类：单继承
//类与接口：多实现，一个类可以实现多个接口
interface A{}
interface B{}
interface C extends A,B{}

//3、一个类继承了父类，又同时实现了接口，如果父类和接口中同名方法，优先调用父类方法
interface A1{
    public default void show(){
        System.out.println("接口A1中的show方法");
    }
}
class B1 {
    public void show(){
        System.out.println("B1类中的show方法");
    }
}
class C1 extends B1 implements A1{}