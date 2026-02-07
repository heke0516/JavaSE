package com.itheima.capsulation;
//规范：将成员变量private，然后提供public的get和set方法
public class Student {
    //private关键字进行隐藏
    String name;
    private int age;
    private double math;
    private double english;

    public void setAge(int age){
        if(age>0&&age<=120){
            this.age = age;
        }else{
            System.out.println("年龄输入有误！");
        }
    }
    public int getAge(){
        return age;
    }


}
