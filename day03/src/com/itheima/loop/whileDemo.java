package com.itheima.loop;

public class whileDemo {
    public static void main(String[] args) {
        System.out.println("余额超过本金需要"+calculate(100000,0.017)+"年");
        System.out.println("纸张超过珠穆朗玛峰高度需要折"+calculate1(0.1,8848860)+"次");
    }

    public static int calculate(double money,double rate) {
        int year=0;
        double goal=money*2;
        while(money<goal){
            money=money+money*rate;
            year++;
        }
        return year;
    }
    public static int calculate1(double paper,double height) {
        int count=0;
        while(paper<height){
            paper=paper*2;
            count++;
        }
        return count;
    }
}
