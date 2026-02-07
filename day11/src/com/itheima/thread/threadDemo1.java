package com.itheima.thread;

public class threadDemo1 {
    //main方法本身运行在main线程中，主线程
    public static void main(String[] args) {
        //掌握创建线程的方法一:继承Thread类
        //创建线程类的对象
        Thread t1 = new MyThread();
        //启动线程
        t1.start();

        //不要把主线程任务放在启动子线程之前
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出"+ i);
        }

    }
}
    //定义一个子类继承Thread类
class MyThread extends Thread{
    //重写Thread的run()方法
        @Override
        public void run() {
            //在run方法中编写线程的任务代码
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程输出"+ i);
            }
        }
    }
