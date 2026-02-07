package com.itheima.Stream;

import java.util.*;
import java.util.stream.Stream;

public class streamDemo2 {
    public static void main(String[] args) {
        //目标：获取stream流的方式
        //1、获取集合的stream流，调用集合提供的stream()方法
        Collection<String> list = new ArrayList<>();
        Stream<String> s1=list.stream();

        //2、map集合，怎么拿数据流？
        Map<String,Integer> map = new HashMap<>();
        //获取键流
        Stream<String> s2=map.keySet().stream();
        //获取值流
        Stream<Integer> s3=map.values().stream();
        //获取键值对流
        Stream<Map.Entry<String,Integer>> s4=map.entrySet().stream();

        //3、数组，怎么获取数据流？
        String[] arr = {"小王","小张","小李"};
        Stream<String> s5= Arrays.stream(arr);
        System.out.println(s5.count());
    }
}
