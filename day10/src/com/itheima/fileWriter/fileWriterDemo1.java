package com.itheima.fileWriter;

import java.io.FileWriter;
import java.io.Writer;

public class fileWriterDemo1 {
    public static void main(String[] args) {
        //目标：掌握文件字符输出流写入文件，到外存中
        //创建文件字符输出流对象，将数据写入文件
        try (//Writer fw = new FileWriter("day10\\src\\test4.txt")
              Writer fw = new FileWriter("day10\\src\\test4.txt", true)) {  //追加写入,而不是覆盖
            //写数据
            fw.write("hello world");
            fw.write("hello java");
            fw.write("\r\n");  //换行
            fw.write("hello itheima");

            fw.flush();  //刷新缓冲区，将数据写入文件，刷新后，流可以继续使用
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
