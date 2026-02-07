package com.itheima.extendsDemo;

public class People {
    //父类
    //继承的好处：代码复用，减少了重复的代码
    private String name;
    private char sex;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
