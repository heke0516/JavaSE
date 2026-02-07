package com.itheima.FinalDemo;

public class FinalDemo1 {
    public static void main(String[] args) {
        //目标：认识final关键字
        //3、修饰变量，该变量仅能被赋值一次
        final int a=1;
        //a=2;
    }
}

//1、final修饰类，类不能被继承
final class Fu{}
//class Zi extends Fu{}

//2、final修饰方法，方法不能被重写
class C{
    public final void show(){
        System.out.println("show");
    }
}
class D extends C{
//    @Override
////    public void show() {
////        System.out.println("重写show");
////    }
}
