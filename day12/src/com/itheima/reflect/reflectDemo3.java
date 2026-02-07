package com.itheima.reflect;

import java.io.FileNotFoundException;

public class reflectDemo3 {
    public static void main(String[] args) throws FileNotFoundException, IllegalAccessException {
        //反射的基本作用
        //1、获取类中的全部成分
        //2、可以破坏封装性
        //3、可以绕过泛型的约束
        //4、最重要的用途：适合做Java的框架，基本上主流的框架都基于反射

        //目标：做框架的通用技术，对于任意一个对象，该框架都可以把该对象的信息写到文件中
        Dog dog = new Dog("小黄", 2);
        SaveObjectFrameWork.saveObject(dog);
        Student stu = new Student("小王", 18);
        SaveObjectFrameWork.saveObject(stu);
        Teacher teacher = new Teacher("老周", 44, "123456", "北京");
        SaveObjectFrameWork.saveObject(teacher);
    }
}
