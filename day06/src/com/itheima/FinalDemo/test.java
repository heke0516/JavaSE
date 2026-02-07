package com.itheima.FinalDemo;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //加油站支付程序
        //1、创建卡片父类，金卡银卡
        //2、定义金卡类继承card类，重写消费方法（8折），独有功能打印洗车票
        //2、定义银卡类继承card类，重写消费方法（9折）
        //3、创建一个金卡对象，交给一个独立的业务，存款，消费
        GoldCard goldCard = new GoldCard("G933cu","hk","13730018763",5000);
        pay(goldCard);
        //4、创建一个银卡对象，交给一个独立的业务，存款，消费
        SilverCard silverCard = new SilverCard("S933cu","hk","13730018763",2000);
        pay(silverCard);
    }

    //用一个方法来刷卡，金卡/银卡
    public static void pay(card c){
        System.out.println("请刷卡，输入当前消费的金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.payMoney(money);
    }
}
