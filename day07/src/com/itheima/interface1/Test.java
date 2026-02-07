package com.itheima.interface1;

public class Test {
    public static void main(String[] args) {
        System.out.println(A.SCHOOL_NAME);
        //接口和抽象类（通过子类继承来创建对象）一样都不能创建对象
    }
}
//C被称为实现类，可同时实现多个接口
//C必须重写接口A和B中的抽象方法，否则C还是抽象类
class C implements A, B{

    @Override
    public void run() {

    }

    @Override
    public String go() {
        return "";
    }

    @Override
    public void play() {

    }
}
