package com.itheima.charset;

import java.util.Arrays;

public class charsetDemo1 {
    public static void main(String[] args) {
        //实现字符编码和解码
        //1、编码
        String s="我爱你中国abc666";  //一个汉字3个字节
        byte[] bytes = s.getBytes();  //平台的utf-8编码的
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));
    }
}
