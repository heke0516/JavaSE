package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //需求：指定位数的验证码(方法一)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要生成的验证码的位数：");
        int code_length = sc.nextInt();
        String allowedChars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";  //26+26+10=62
        String code="";
        Random random = new Random();
        for(int i=0;i<code_length;i++){
            int intInRange = random.nextInt(62);
            char c=allowedChars.charAt(intInRange);
            code+=c;
        }
        System.out.println("验证码是："+code);

    }
}
