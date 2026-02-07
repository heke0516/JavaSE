package com.itheima.thisDemo;

public class Student {
    String name;
    public void print(){
        //this是一个变量，用在方法中，用于拿到当前对象的地址
        //哪个对象调用这个方法，this就拿到哪个对象
        System.out.println(this.name);
    }

    public void printHobby(String name){
        System.out.println(this.name+"的爱好是："+name);//调用this相当于调用类中的全局变量
    }
}
