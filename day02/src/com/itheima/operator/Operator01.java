package com.itheima.operator;

public class Operator01 {
    public static void main(String[] args) {
        //运算符自增自减顺序
        int a = 10;
        int b = 10;
        int re= a++;
        int er= ++b;
        System.out.println(re);
        System.out.println(er);
    }
}
