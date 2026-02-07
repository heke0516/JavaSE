package com.itheima.scanner;

import java.util.Scanner;

public class ScannerDemo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("名字：" + name + "，年龄：" + age);
        sc.close();
        System.out.println("程序结束");
        System.out.println("程序结束");
        System.out.println("程序结束");
    }
    //写一个程序，让用户输入名字和年龄，然后打印出来


}
