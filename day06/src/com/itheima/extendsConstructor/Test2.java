package com.itheima.extendsConstructor;

public class Test2 {
    public static void main(String[] args) {
        //理解this(...)调用兄弟构造器
        //注意：super()和this()必须写在构造器的第一行，而且两者不能同时出现。
        Student s1 = new Student("张三", 18, '男');
        System.out.println(s1);
        Student s2 = new Student("李四", 19, '男', "传智");
        System.out.println(s2);
    }
}
