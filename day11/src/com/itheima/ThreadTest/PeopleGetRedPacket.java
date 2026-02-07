package com.itheima.ThreadTest;

import java.util.List;

public class PeopleGetRedPacket extends  Thread{
    private final List<Integer> redPacket;

    public PeopleGetRedPacket(List<Integer> redPacket, String name) {
        super(name);
        this.redPacket = redPacket;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (redPacket) {
                if (redPacket.isEmpty()) {
                    break;
                }
                //随机一个索引得到一个红包
                int index = (int) (Math.random() * redPacket.size());
                int money = redPacket.remove(index);
                System.out.println(name + "抢到红包：" + money);
                if (redPacket.isEmpty()){
                    System.out.println(name + "抢完红包！活动结束！");
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
