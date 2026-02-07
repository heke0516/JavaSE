package com.itheima.threadsafe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;
    /*方法三：Lock
    private final Lock lock = new ReentrantLock();
    //在核心代码块前调用lock.lock()
    //在核心代码块后调用lock.unlock()*/

    public void drawMoney(double money) {
        //拿到当前谁来取钱
        String name = Thread.currentThread().getName();
        //判断余额是否充足
        //方法一：同步代码块，把访问共享单元的核心代码上锁
        synchronized (this) {
            /*为什么使用this?
            * 小明小红过来，使用的是他们的账户
            * 小黑小白过来，使用的是他们的账户*/
            if (this.money >= money) {
                System.out.println(name + "取钱成功，取钱金额：" + money);
                this.money -= money;
                System.out.println(name + "取钱后，余额为：" + this.money);
            }else{
                System.out.println(name + "取钱失败，余额不足");
            }
        }
    }
    //方法二：同步方法，把访问共享单元的核心方法上锁
    //public synchronized void drawMoney(double money) {}
}
