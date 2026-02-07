package com.itheima.staticDemo;

public class Test2 {
    //认识static关键字修饰成员方法
    public static void main(String[] args) {
        User.print();

        User u1 = new User();
        u1.print();

        u1.show();
    }

}
