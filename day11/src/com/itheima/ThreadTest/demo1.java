package com.itheima.ThreadTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class demo1 {
    public static void main(String[] args) {
        //完成多线程抢红包案例
        //编号1-100的员工（100个线程）
        //200个红包，小红包【1-30】元，占比80%；大红包【31-100】元，占比20%
        List<Integer> redPacket = getRedPackets();
        //2、创建100个线程，模拟100个员工来抢红包
        for (int i = 1; i <= 100; i++) {
            new PeopleGetRedPacket(redPacket,"人"+i).start();
        }

    }

    //1、准备200个红包返回
    public static List<Integer> getRedPackets(){
        Random random = new Random();
        List<Integer> redPacket = new ArrayList<>();
        for (int i = 0; i < 160; i++) {
            redPacket.add(random.nextInt(30)+1);
        }
        for (int i = 0; i < 40; i++) {
            redPacket.add(random.nextInt(70)+31);
        }
        return redPacket;
    }
}
