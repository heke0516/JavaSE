package com.itheima.Genericity;

import java.util.ArrayList;

public class GenericityDemo5 {
    public static void main(String[] args) {
        //目标：搞清楚泛型和集合不支持基本数据类型，只能支持对象类型
        ArrayList<Integer> list = new ArrayList<>();
        //Integer是int的对象类型，类似的：String、Double、Character、Boolean、Byte、Short、Long
        //泛型擦除：泛型在编译阶段会被擦除，只保留类型信息，所有类型会恢复成object类型

        //自动装箱：基本数据类型的数据可以直接变成包装对象的数据
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1);
        System.out.println(i1==i2);

        //自动拆箱：包装对象数据可以直接变成基本数据类型
        int i3 = i1;
        System.out.println(i3);

        list.add(123);  //自动装箱
        int rs=list.get(0); //自动拆箱

        int j=23;
        String s=j+"";  //任意类型对象+""就会转成字符串
        System.out.println(s);

        //字符串转成对应的基本数据类型
        String s1="123";
        int i4 = Integer.parseInt(s1);
        System.out.println(i4);
    }
}
