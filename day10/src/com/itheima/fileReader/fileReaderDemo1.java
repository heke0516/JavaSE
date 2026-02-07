package com.itheima.fileReader;

import java.io.FileReader;

public class fileReaderDemo1 {
    public static void main(String[] args) {
        //掌握文件字符输入流读取文件
        //创建文件字符输入流与源文件接通
        try (FileReader fr = new FileReader("day10\\src\\test3.txt")) {
            //定义一个字符数组，每次读取多个字符
            char[] buffer = new char[1024];
            int len;  //读取的字符个数
            while ((len = fr.read(buffer)) != -1) {
                //把读取到的字符数组转换成字符串，并打印
                System.out.print(new String(buffer, 0, len));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
