package com.itheima.junit;

public class StringUtil {
    public static void printNumber(String name) {
        if(name == null){
            System.out.println("名字不能为空");
            return;
        }
        System.out.println("名字长度是"+name.length());
    }

    /*
    求字符串最大索引
     */
    public static int getMaxIndex(String data) {
        if (data == null||data.equals("")) return -1;
        return data.length();  //实际应是data.length()-1
    }
}
