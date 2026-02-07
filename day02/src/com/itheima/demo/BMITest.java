package com.itheima.demo;

import java.util.Scanner;

public class BMITest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        System.out.println("请输入性别：");
        String sex = sc.next();

        System.out.println("请输入体重：");
        double weight = sc.nextDouble();

        System.out.println("请输入身高：");
        double height = sc.nextDouble();

        System.out.println("您的BMI为："+ getBMI(weight, height));


    }
    public static double getBMI(double weight,double height){
        return weight/(height*height);
    }
}
