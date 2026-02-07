package com.itheima.Genericity;

import java.util.ArrayList;

public class GenericityDemo1 {
    public static void main(String[] args) {
        //目标：认识泛型
        //泛型提供了在编译阶段约束所能操作的数据类型
        ArrayList list=new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add(123);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));

        ArrayList<String> list1=new ArrayList<String>();  //JDK7开始支持后边尖括号中的类可以不写
        list1.add("hello");
        list1.add("world");
        list1.add("java");
        //list1.add(123);  //报错，因为约定了泛型为String
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.get(1));
    }
}
