package com.itheima.extendsDemo;

public class Teacher extends  People{
    //子类，能继承父类的非私有属性和方法
    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
