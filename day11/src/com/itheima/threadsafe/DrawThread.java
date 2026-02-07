package com.itheima.threadsafe;
//取钱线程类
public class DrawThread extends  Thread{
    private Account acc;  //记住线程对象要处理的账户对象
    public DrawThread(String name, Account acc) {
        super(name);//将线程名称name传递给父类
        this.acc = acc;
    }

    //重写run()方法
    @Override
    public void run() {
        acc.drawMoney(100000);
    }
}
