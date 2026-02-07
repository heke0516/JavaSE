package com.itheima.Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setDemo1 {
    public static void main(String[] args) {
        //目标：认识set集合
        //HashSet: 无序，不重复，无索引
        //LinkedHashSet: 有序，不重复，无索引（每个元素都额外多了一个双链表的机制，记录它前后元素的位置）
        //TreeSet: 排序，不重复，无索引(基于红黑树实现的排序)
        //Set<String> set=new HashSet<>();
        Set<String> set=new LinkedHashSet<>();
        set.add("java");
        set.add("java");
        set.add("C++");
        set.add("C++");
        System.out.println(set);
        //hashSet的原理
        String s1="abc";
        String s2="abcd";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //TreeSet集合：排序（升序），不重复，无索引
        Set<Double> set1=new TreeSet<>();
        set1.add(9.5);
        set1.add(9.5);
        set1.add(9.1);
        set1.add(9.3);
        System.out.println(set1);

    }
}
