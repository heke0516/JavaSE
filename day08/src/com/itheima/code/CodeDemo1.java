package com.itheima.code;

public class CodeDemo1 {
    //静态代码块：有static修饰，属于类，与类一起优先加载(在main方法之前)，自动执行一次
    //作用：完成对类的静态数据的初始化
    static{
        System.out.println("静态代码块执行了");
    }
    public static void main(String[] args) {
        //认识代码块
        System.out.println("main方法执行了");
    }
}
