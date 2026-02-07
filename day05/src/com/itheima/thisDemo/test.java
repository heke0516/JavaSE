package com.itheima.thisDemo;

public class test {
    public static void main(String[] args) {
        //认识this关键字
        Student s1 = new Student();
        s1.name = "张三";
        s1.print();

        Student s2 = new Student();
        s2.name = "汪苏泷";
        s2.printHobby("唱歌");


    }
}
