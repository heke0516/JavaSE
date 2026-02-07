package com.itheima;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //找素数，x-y之间有多少个素数，并输出
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始数字：");
        int x = sc.nextInt();
        System.out.println("请输入结束数字：");
        int y = sc.nextInt();
        int count=0;
        for(int i=x;i<=y;i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("素数个数："+count);


    }
    public static boolean isPrime(int n){
        int sqrt = (int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
