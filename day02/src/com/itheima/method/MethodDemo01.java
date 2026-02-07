package com.itheima.method;

public class MethodDemo01 {
    public static void main(String[] args) {
        System.out.println("最大的数是"+FoundMax(10,20));
    }

    public static int FoundMax(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }
}


