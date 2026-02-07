package com.itheima.fileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //掌握文件字节输入流读取文件中的字节数组到 内存 中
        //1、创建文件字节输入流管道与文件建立联系
        InputStream is = new FileInputStream("day10\\src\\test.txt");

        //2、读取文件中的字节并输出
        /*int b;
        while((b=is.read())!=-1){
            System.out.print((char)b);
        }*/
        //每次读取一个字节的问题：性能较差，读取汉字（三个字节）时会乱码

        //定义一个字节数组用于读取
        byte[] buffer = new byte[3];
        //定义一个变量记录每次读取的字节个数
        int len;
        while((len=is.read(buffer))!=-1){
            String str=new String(buffer,0,len);
            System.out.print(str);
        }
        //依然无法避免汉字乱码，因为存在截断汉字字节的可能
    }
}
