package com.itheima.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class threadDemo3 {
    public static void main(String[] args) {
        //掌握多线程的创建方式三：实现Callable接口; 优点：可以获取线程执行完毕后的返回值，可以抛出异常
        //创建一个Callable接口的实现类对象
        Callable c1 = new MyCallable(5);
        //把Callable对象封装成一个真正的线程任务对象FutureTask
        /*
        * 未来任务对象的作用？
        *   a、本质上是一个Runnable线程任务对象，可以交给Thread线程对象执行
        *   b、获取线程任务执行完毕的返回值
        * */
        FutureTask<String> f1 = new FutureTask<>(c1);
        //把FutureTask对象封装成一个线程任务对象
        Thread t1 = new Thread(f1);
        //启动线程
        t1.start();

        Callable c2 = new MyCallable(5);
        FutureTask<String> f2 = new FutureTask<>(c2);
        Thread t2 = new Thread(f2);
        t2.start();

        //获取线程任务执行完毕的返回值，通过FutureTask对象调用get()方法
        try {
            //如果发现第一个线程还没有执行完毕，会让出CPU执行权，继续执行下面的代码
            System.out.println(f1.get());
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            System.out.println(f2.get());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

//定义一个线程任务类实现Callable接口
class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n) {
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            sum += i;
        }
        return "子线程计算1-"+n+"的结果为："+ sum;
    }
}