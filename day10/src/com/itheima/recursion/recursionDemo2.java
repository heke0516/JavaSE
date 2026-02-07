package com.itheima.recursion;

public class recursionDemo2 {
    public static void main(String[] args) {
        //猴子吃桃问题
        System.out.println(factorial(1));
    }
    public static int factorial(int n){
        if(n==10){
            return 1;
        }
        return (factorial(n+1)+1)*2;
    }
}
