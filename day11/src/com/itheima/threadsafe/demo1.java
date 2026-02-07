package com.itheima.threadsafe;

public class demo1 {
    public static void main(String[] args) {
        //模拟线程安全问题；小明和小红共同账户同时取款10万
        Account acc = new Account("6555",100000);

        //设计线程类。创建小明和小红两个线程
        new DrawThread("小明",acc).start();
        new DrawThread("小红",acc).start();
    }
}
