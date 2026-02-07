package com.itheima.Map;

import java.util.HashMap;
import java.util.Map;

public class mapDemo4 {
    public static void main(String[] args) {
        //map集合的遍历方法二：lambda表达式
        Map<String,Double> map=new HashMap<>();
        map.put("小王",18.9);
        map.put("小张",19.9);
        map.put("小李",20.9);

        //直接调用map集合的forEach方法
        map.forEach((k,v)->{
            System.out.println(k+"---"+v);
        });

    }
}
