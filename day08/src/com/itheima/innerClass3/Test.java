package com.itheima.innerClass3;

public class Test {
    public static void main(String[] args) {
        //认识匿名内部类
        //匿名内部类本质上就是一个子类，同时会立即构建一个子类对象
        //作用：用于更方便地创造一个子类对象
        Animal animal = new Animal(){
            @Override
            public void cry() {
                System.out.println("匿名内部类");
            }
        };
        animal.cry();
    }
}
