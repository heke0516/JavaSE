package com.itheima.recursion;

import java.io.File;

public class FileSearch {
    public static void main(String[] args) {
        //目标：完成文件搜索  F:\黑马python\日本.txt
        File dir=new File("F:\\");
        searchFile(dir,"日本.txt");
    }

    /**
     * 递归搜索文件
     * @param dir 搜索的目录
     * @param filename 要搜索的文件名
     */
    private static void searchFile(File dir, String filename)  {
        if(dir== null|| !dir.exists()||dir.isFile()){
            return;
        }
        //获取目录下所有一级文件或者文件夹对象
        File[] files = dir.listFiles();
        //判断当前目录下是否存在一级文件对象，才可以遍历
        if(files!=null&& files.length>0){
            for (File file : files) {
                if(file.isFile()){
                    //判断文件名是否相同
                    if(file.getName().contains(filename)){
                        System.out.println("找到文件："+file.getAbsolutePath());
                    }
                }else{
                    //递归调用
                    searchFile(file,filename);
                }
            }
        }
    }
}
