package com.itheima.Collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
        //学习Collection提供的通用集合功能
        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("C++");
        list.add("python");
//        System.out.println( list);  //[hello, world]
//        System.out.println( list.size());
//        System.out.println( list.get(0));
//        System.out.println( list.contains("hello"));
//        list.clear();
//        System.out.println( list.isEmpty());
//        System.out.println( list);

        //迭代器遍历
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }*/
        for(String s:list){   //简化遍历版本
            System.out.println(s);
        }
    }
}
