package com.itheima.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo3 {
    public static void main(String[] args) {
        //map集合的遍历方法二：键值对整体
        Map<String,Double> map=new HashMap<>();
        map.put("小王",18.9);
        map.put("小张",19.9);
        map.put("小李",20.9);
        Set<Map.Entry<String, Double>> entries=map.entrySet();  //获取所有键值对集合
        for (Map.Entry<String, Double> entry : entries) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
    }
}
