package com.itheima.abstractDemo;

//抽象类不能创建对象，仅作为一个特殊的父类，让子类继承并实现
public abstract class A {
    //抽象方法,抽象方法不能有方法体,只有方法声明
    public abstract void show();  //有抽象方法的一定要是抽象类
}
