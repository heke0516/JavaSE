package com.itheima.interface1;

public interface A {
    //JDK8之前，接口中只能定义常量和抽象方法
    //1、常量
    String SCHOOL_NAME="黑马";

    //2、抽象方法,可以省略public abstract不写
    //public abstract void show();
    void run();
    String go();
}
