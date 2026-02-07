package com.itheima.extendsConstructor;

public class Test {
    public static void main(String[] args) {
        //认识子类构造器的特点
        //子类的全部构造器，都会先调用父类的构造器，再执行自己
        Son s = new Son();
    }
}

class Father{
    public Father(){
        System.out.println("父类无参构造器");
    }
}
class Son extends Father{
    public Son(){
        System.out.println("子类无参构造器");
    }
}