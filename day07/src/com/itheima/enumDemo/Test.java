package com.itheima.enumDemo;

public class Test {
    public static void main(String[] args) {
        //目标：使用枚举类
        A a1 = A.X;
        System.out.println(a1);
        A a2 = A.Y;
        System.out.println(a2);
        System.out.println(a1.ordinal());//0,索引
        System.out.println(a2.ordinal());//1
    }
}
