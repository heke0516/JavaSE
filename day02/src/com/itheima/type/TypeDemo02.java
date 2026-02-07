package com.itheima.type;

public class TypeDemo02 {
    public static void main(String[] args) {
        //理解表达式的自动类型提升
        calc(10, 20, 10.0, 'a');
    }

    public static double calc(int a, int b, double d, char c) {
        return a + b + d + c;
    }

}
