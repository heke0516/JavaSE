package com.itheima.commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class commonsioDemo1 {
    public static void main(String[] args) throws IOException {
        //目标：IO框架
        FileUtils.copyFile(new File("day10\\src\\咏鹅.txt"),new File("day10\\src\\咏鹅_copy.txt"));
        
    }
}
