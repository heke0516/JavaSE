package com.itheima.interface2;

public class Test {
    public static void main(String[] args) {
        //目标：接口的好处，一个类可以同时实现多个接口，使类的角色更多
        People p=new Student();
        Driver d=new Student();
        BoyFriend b=new Student();
    }
}
interface Driver{}
interface BoyFriend{}

class People{}
class Student extends People implements Driver, BoyFriend{

}