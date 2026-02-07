package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //需求：猜数字，1-100之间，用户输入数字，判断数字大小，并给出提示，直到用户输入的数字和随机数一致，结束游戏
        // 生成一个[0, 100)之间的随机整数
        Random random = new Random();
        int intInRange = random.nextInt(100);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数字：");
            int number = sc.nextInt();
            if(number == intInRange){
                System.out.println("恭喜你，猜对了！");
                break;
            } else if(number > intInRange) {
                System.out.println("数字太大了！");
            }else {
                System.out.println("数字太小了！");
            }
        }

    }
}
