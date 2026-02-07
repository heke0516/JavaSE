package com.itheima;

import java.util.Random;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //静态初始化数组
        String[] names = {"张三","李四","王五"};
        Random random = new Random();
        int index=random.nextInt(0, names.length);
        System.out.println(names[index]);

    }
}
