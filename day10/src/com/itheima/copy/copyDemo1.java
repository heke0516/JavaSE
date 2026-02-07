package com.itheima.copy;

import java.io.*;

public class copyDemo1 {
    public static void main(String[] args) {
        //目标：使用字节流完成文件复制操作
        //源文件：C:\Users\和科\Pictures\Camera Roll\02dda619e6da0de90b538a56b7f5199.jpg
        //目标文件：C:\Users\和科\Pictures\Camera Roll\copy_02dda619e6da0de90b538a56b7f5199.jpg
        copyFile("C:\\Users\\和科\\Pictures\\Camera Roll\\02dda619e6da0de90b538a56b7f5199.jpg","C:\\Users\\和科\\Pictures\\Camera Roll\\copy_02dda619e6da0de90b538a56b7f5199.jpg");
    }
    //复制文件
    public static void copyFile(String srcPath,String destPath) {
        InputStream fis=null;
        OutputStream fos=null;
        try {
            //1、创建一个文件字节输入流管道与源文件接通
            fis=new FileInputStream(srcPath);
            //2、创建一个文件字节输出流管道与目标文件接通
            fos=new FileOutputStream(destPath);
            //读取一个字节数组，写入一个字节数组
            byte[] buffer=new byte[1024];
            int len;
            while((len=fis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
            System.out.println("复制完毕！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {  //最后一定会执行一次，即便程序出现异常
            //释放资源
            try {
                if(fis!=null) fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if(fos!=null) fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
