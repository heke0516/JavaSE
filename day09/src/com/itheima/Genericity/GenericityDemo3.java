package com.itheima.Genericity;

public class GenericityDemo3 {
    public static void main(String[] args) {
        //搞清楚泛型接口的使用
        //需求：对学生/老师数据进行增删改查
        StudentData studentData = new StudentData();
        studentData.add(new Student());
        studentData.delete(new Student());
        studentData.update(new Student());
        studentData.query(new Student());
    }
}
