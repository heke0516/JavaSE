package com.itheima.abstractDemo;

public class B extends  A{
    //一个类继承抽象类，必须重写继承的所有抽象方法，否则，B类自身也必须定义为抽象类
    @Override
    public void show() {
        System.out.println("B类重写抽象方法");
    }
}
