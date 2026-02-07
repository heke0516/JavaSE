package com.itheima;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //输出1-10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // 调用getCode()方法并打印返回的代码值到控制台
        System.out.println(getCode());
    }

    //写一个生成随机4位验证码的方法
    public static String getCode() {
        String code = "";
        for (int i = 0; i < 4; i++) {
            int number = (int) (Math.random() * 10);
            code += number;
        }
        return code;
    }

}
