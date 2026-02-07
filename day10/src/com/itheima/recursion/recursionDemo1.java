package com.itheima.recursion;

public class recursionDemo1 {
    public static void main(String[] args) {
        //递归入门
        System.out.println(factorial(5));
        System.out.println(sum(5));
    }
    //计算n的阶乘
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    //计算1-n的和，用递归方法
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
