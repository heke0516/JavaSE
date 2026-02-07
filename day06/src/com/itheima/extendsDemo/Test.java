package com.itheima.extendsDemo;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("张三");
        t.setSex('男');
        t.setSkill("java");
        System.out.println(t.getName() + "\t" + t.getSex() + "\t" + t.getSkill());
    }
}
