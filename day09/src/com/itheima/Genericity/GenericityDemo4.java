package com.itheima.Genericity;

public class GenericityDemo4 {
    public static void main(String[] args) {
        //目标：泛型方法的使用
        //需求：打印任意数组的内容
        String[] names={"张三","李四","王五"};
        printArray(names);
        Integer[] ages={10,20,30};  //泛型不支持基本数据类型：Java 泛型只能接受对象类型（引用类型），不能直接使用基本数据类型
        //int 是基本数据类型，而 Integer 是包装类（对象类型）
        printArray(ages);
    }

    /*private static void printArray(String[] names) {
        //只能打印字符串类型数组
    }*/
    public static <T> void printArray(T[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
