package com.itheima.extendsOverride;

public class Test {
    public static void main(String[] args) {
        //认识方法重写
        //私有方法，静态方法，不能重写
        //规范：声明不变，方法重现
        Dog dog = new Dog();
        dog.cry();
    }
}

class Animal{
    public void cry(){
        System.out.println("叫");
    }
}
class Dog extends Animal{
    //方法重写，方法名称，形参列表和父类一样
    @Override  //方法重写的标志
    public void cry(){
        System.out.println("汪汪汪");
    }
}
