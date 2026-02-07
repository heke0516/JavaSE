package com.itheima.type;

import org.w3c.dom.ls.LSOutput;

public class TypeDemo01 {
    public static void main(String[] args) {
        //认识自动类型转换，强制类型转换
        byte a=12;  //自动类型转换
        double b=100;
        print(a);
        print2(a);
        //print3(b);
        int m=15000;
        byte n=(byte) m;  //强制转换，数据溢出！
        System.out.println(n);

        double f=3.14;
        int i=(int) f;
        System.out.println(i);
    }

    public static void print(int b){
        System.out.println(b);
    }

    public static void print2(double b){
        System.out.println(b);
    }

//    public static void print3(int c){
//        System.out.println(c);
//    }



}
