package com.itheima.executorService;

import java.util.concurrent.*;

public class executorServiceDemo1 {
    public static void main(String[] args) {
        //创建线程池对象
        //1、使用线程池的实现类：ThreadPoolExecutor，声明七个参数
        ExecutorService pool = new ThreadPoolExecutor(3,5,10
        , TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        //2、使用线程池对象执行任务。看会不会线程复用
        Runnable target = new MyRunnable();
        pool.execute(target); //创建第一个线程
        pool.execute(target);  //创建第二个线程
        pool.execute(target);  //创建第三个线程
        pool.execute(target);  //线程复用
        pool.execute(target);  //线程复用

        /*关闭线程池，一般不关闭
        pool.shutdown(); //等所有任务执行完毕，再关闭线程池
        pool.shutdownNow(); //不等所有任务执行完毕，立即关闭线程池*/

    }
}
