package com.itheima.lambda;

public class lambdaDemo1 {
    public static void main(String[] args) {
        Swim s=()-> {
                System.out.println("老师开始游...");
        };
        s.swimming();
    }
}


abstract class Animal{
    public abstract void cry();
}

@FunctionalInterface  //声明函数式接口的注解
//函数式接口：只有一个抽象方法的接口
interface Swim{
    void swimming();
}