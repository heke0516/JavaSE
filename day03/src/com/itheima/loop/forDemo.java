package com.itheima.loop;

public class forDemo {
    public static void main(String[] args) {
        System.out.println("1-10的奇数和是："+sum(10));
    }

    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }
}
