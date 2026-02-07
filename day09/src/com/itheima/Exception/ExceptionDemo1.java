package com.itheima.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {
        //认识异常
        show();
        show1();
    }
    public static void show() {
        //运行时异常特点：编译阶段不报错，运行阶段报错，都继承自父类RuntimeException
        int[] arr={1,2,3};
        System.out.println(arr[3]);
        System.out.println(10/0);
        //空指针异常
        String str=null;
        System.out.println(str.charAt(0));

    }
    public static void show1() throws ParseException {
        //编译异常：编译阶段报错，运行阶段不报错
        String str="2026-1-18- 20:17:30";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=sdf.parse(str);  //编译时异常，提箱程序员这里很容易出错！
        System.out.println(date);

    }
}
