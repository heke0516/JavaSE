package com.itheima.abstractDemo2;

public class Test {
    public static void main(String[] args) {
        //目标：理解抽象类的应用场景:模板方法设计模式
        //例子：老师和学生
        //上课来班级
        //老师上课，学生听课
        //下课离开
        Teacher t = new Teacher();
        t.classroom();
        Student s = new Student();
        s.classroom();

    }
}
