package com.itheima.extendsConstructor;

public class Student {
    private String name;
    private int age;
    private char sex;
    private String school;

    public Student(String name, int age, char sex) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.school = "清华大学";
        this(name, age, sex, "清华大学");//this()调用兄弟构造器
    }
    public Student(String name, int age, char sex, String school) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.school = school;
    }

    public Student() {
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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", school='" + school + '\'' +
                '}';
    }
}
