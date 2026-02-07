package com.itheima.staticDemo;

public class Test {
    public static void main(String[] args) {
        //认识static关键字修饰成员变量
        Student.name="袁华";

        Student s1=new Student();
        s1.name="马冬梅";
        Student s2=new Student();
        s2.name="秋雅";

        System.out.println(s1.name);//秋雅
        System.out.println(Student.name);//秋雅
    }
}
