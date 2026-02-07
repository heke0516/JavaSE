package com.itheima.polymorphsm2;

public class tortoise extends Animal {
    String name="乌龟";
    @Override
    public void run() {
        System.out.println("乌龟跑得慢");
    }

    //乌龟缩头方法
    public void shrink(){
        System.out.println("乌龟缩头");
    }
}
