package com.itheima.javabean;

public class StudentOperater {
    //将对对象的操作放在一个类中，方便管理
    public void printStudent(Student s){//打印对象属性
        System.out.println("姓名："+s.getName()+"，年龄："+s.getAge()+"，身高："+s.getHeight());
    }
}
