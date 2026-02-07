package com.itheima.code;

public class CodeDemo2 {
    //实例代码块：无static修饰，每次创建对象时，都会执行
    //作用：初始化对象的实例资源
    {
        System.out.println("实例代码块执行了");
    }

    public static void main(String[] args) {
        //认识实例代码块
        System.out.println("main方法执行了");
        CodeDemo2 c2=new CodeDemo2();
        CodeDemo2 c3=new CodeDemo2();
        CodeDemo2 c4=new CodeDemo2();

    }
}