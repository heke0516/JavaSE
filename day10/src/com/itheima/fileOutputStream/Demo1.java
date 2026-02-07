package com.itheima.fileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //掌握文件字节输出流将数据写入文件
        //1、创建文件字节输出流管道与文件建立联系
        OutputStream os = new FileOutputStream("day10\\src\\test2.txt");
        //2、写入数据
        os.write(97);
        os.write('d');
        //os.write('和');  //乱码
        os.write("\r\n".getBytes());  //换行
        //3、写一个字节数组出去
        byte[] bytes = "我爱你中国abc6657".getBytes();
        os.write(bytes);
        os.write("\r\n".getBytes());  //换行
        //4、写一个字节数组的一部分出去
        os.write(bytes,0,3);
        os.write("\r\n".getBytes());  //换行

        os.close();  //关闭流，释放资源
    }
}
