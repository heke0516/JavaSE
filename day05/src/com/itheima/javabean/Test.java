package com.itheima.javabean;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student("张三", 18, 1.75);
        StudentOperater so = new StudentOperater();
        so.printStudent(s1);
        Student s2 = new Student("李四", 18, 1.75);
        so.printStudent(s2);

    }
}
