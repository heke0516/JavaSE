package com.itheima.Stream;

import java.util.ArrayList;
import java.util.List;

public class streamDemo1 {
    public static void main(String[] args) {
        //认识stream流，体会优势和特点
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("张三丰");
        list.add("张强");
        list.add("张翠山");
        list.add("赵敏");
        //需求：将list集合中，姓张的且名字是三个字的元素，存储到一个新的集合中
        //1、传统方法
        List<String> newlist = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张") && name.length() == 3) {
                newlist.add(name);
            }
        }
        System.out.println(newlist);

        //2、使用stream流（简化集合、数组操作的api，结合了lambda表达式）
        List<String> newlist1 =list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).toList();
        System.out.println(newlist1);
    }
}
