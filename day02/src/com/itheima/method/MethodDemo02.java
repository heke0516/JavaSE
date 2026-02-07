package com.itheima.method;
//掌握方法重载,方法名称相同，形参列表不同
public class MethodDemo02 {
    public static void main(String[] args) {
        print(1,"abc");
        print(2);
        print("abc");
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(int a,String str) {
        System.out.println(a+str);
    }
}
