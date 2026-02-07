package com.itheima.constructor;

public class Student {

    public Student(){
        //构造方法,不用写返回值类型，名称必须是类名，构造方法没有返回值
        //类默认创建无参构造方法
        System.out.println("无参构造方法执行了");
    }

    public Student(String name){
        //有参数的构造方法
        //作用：创建对象时，同时完成对对象成员变量的属性赋值
        System.out.println("有参构造方法执行了");
    }
}
