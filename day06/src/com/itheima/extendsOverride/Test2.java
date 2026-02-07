package com.itheima.extendsOverride;

public class Test2 {
    public static void main(String[] args) {
        Student s = new Student("张三", 18, '男');
        System.out.println(s.toString());  //com.itheima.extendsOverride.Student@5f184fc6 输出的是地址
        //直接输出对象，会默认调用object的toString方法(可以省略不写)
    }
}

class Student{
    private String name;
    private int age;
    private char sex;

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //子类重写object的toString方法，以便返回对象的内容;右键生成toString()
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
