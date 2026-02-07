package com.itheima;

import java.util.Scanner;

public class Test1 {
    //简易版计算器
    //用户输入两个数字，一个计算符，计算结果并输出
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double a = sc.nextDouble();
        System.out.println("请输入第二个数字：");
        double b = sc.nextDouble();
        System.out.println("请输入运算符：");
        char c = sc.next().charAt(0);
        double result=calculater(a,b,c);
        if(result!=-1){
            System.out.println("计算完成！"+a+c+b+"="+calculater(a,b,c));
        }else{
            System.out.println("输入错误！");
        }

    }
    public static double calculater(double a,double b,char c){
        return switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> -1;
        };
    }
}
