package com.itheima.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        //目标：完成 咏鹅 的重新拼装
        //1、创建一个字符缓冲输入流对象与源文件接通
        //创建一个字符缓冲输出流对象与目标文件接通
        try (BufferedReader br = new BufferedReader(new FileReader("day10\\src\\咏鹅.txt"));
             BufferedWriter bw= new BufferedWriter(new FileWriter("day10\\src\\咏鹅_out.txt"))
        ) {
            //准备一个list集合存储每段内容
            List<String> data = new ArrayList<>();
            //2、循环读取每行数据
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            //3、给集合中的内容，按照首字符排序
            Collections.sort(data);
            //4、将排序后的内容，写入目标文件，注意要把data中每个数据的首个字符删除
            for (String s : data) {
                bw.write(s.substring(1));
                bw.newLine();  //换行
            }
            System.out.println("完成！");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
