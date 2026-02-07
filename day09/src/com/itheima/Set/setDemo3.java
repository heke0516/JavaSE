package com.itheima.Set;

import java.util.Set;
import java.util.TreeSet;

public class setDemo3 {
    public static void main(String[] args) {
        Set<Teacher> teachers = new TreeSet<>();
        teachers.add(new Teacher("老王", 39,2500));
        teachers.add(new Teacher("老王", 49,3500));
        teachers.add(new Teacher("老王", 59,4500));
        teachers.add(new Teacher("老王", 29,4501));

        //TreeSet默认不能给自定义对象排序，因为不知道自定义对象排序规则
        //两种解决方法：
        //1、对象类实现Comparable接口，并重写compareTo方法，指定比较规则
        //2、创建TreeSet对象时，传入Comparator接口实现类对象，并重写compare方法，指定比较规则
        System.out.println(teachers);
    }
}
