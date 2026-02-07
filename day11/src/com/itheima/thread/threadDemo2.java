package com.itheima.thread;

public class threadDemo2 {
    public static void main(String[] args) {
        //掌握多线程的创建方式二：实现Runnable接口
        /*优点：任务类只是实现接口，可以继续继承其他类，实现其他接口，扩展性强
        * 缺点：需要多一个Runnable对象
        */
        //创建Runnable接口的实现类对象
        Runnable r = new MyRunnable();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象，启动线程
        new Thread(r).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出"+ i);
        }
    }
}

//定义一个线程任务类实现Runnable接口
class MyRunnable implements Runnable{
    //重写run()方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程任务输出"+ i);
        }
    }
}