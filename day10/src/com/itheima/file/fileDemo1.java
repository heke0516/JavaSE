package com.itheima.file;

import java.io.File;

public class fileDemo1 {
    public static void main(String[] args) {
        //创建file对象，获取文件信息
        File f1 = new File("C:\\Users\\和科\\Pictures\\Camera Roll\\02dda619e6da0de90b538a56b7f5199.jpg");
        System.out.println(f1.length());  //获取文件大小
        System.out.println(f1.getName());  //获取文件名

        //可以使用相对路径定位文件对象
        //只要带盘符的都称为绝对路径
        //相对路径不带盘符，默认在你的idea工程下直接寻找文件，一般用来找工程下的项目文件
        //File f2 = new File("D:\\JavaSEProject\\day10\\src\\test.txt");
        File f2 = new File("day10\\src\\test.txt");
        System.out.println(f2.length());
        System.out.println(f2.getName());

        File f3 = new File("day10\\src\\test2.txt");
        System.out.println(f3.mkdir()); //mkdir只能创建一级目录,mkdirs可以创建多级目录

        //创建file对象代表存在的文件，然后删除
        File f4 = new File("day10\\src\\test2.txt");
        System.out.println(f4.delete());  //file.delete()方法返回值是布尔类型,默认只能删除文件或空文件夹，删除后的文件不会进回收站

        //获取某个文件目录下的一级文件名
        File f5 = new File("day09\\src");
        String[] names = f5.list();
        for (String name : names) {
            System.out.println(name);
        }

        //获取某个文件目录下所有文件对象
        File[] files = f5.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsoluteFile());  //获取绝对路径
        }


    }
}
