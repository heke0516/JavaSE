package com.itheima.polymorphsm1;

public class test {
    public static void main(String[] args) {
        //目标：认识多态，多态是在继承/实现情况下的一种现象，表现为：对象多态、行为多态
        //对象多态，行为多态
        Animal a = new rabbit();
        a.run();  //方法：编译看左边，运行看右边
        System.out.println(a.name);  //成员变量：编译看左边，运行也看左边
        Animal b=new tortoise();
        b.run();
        System.out.println(b.name);
    }
}
