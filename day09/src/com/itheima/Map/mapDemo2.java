package com.itheima.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo2 {
    public static void main(String[] args) {
        //map集合的遍历方法一：键找值
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("嫦娥",22);
        //map.put("嫦娥",25);
        map.put("女儿国王",28);
        map.put("紫霞",26);
        map.put("铁扇公主",38);
        //提取map集合中的所有键到一个set集合中去
        Set<String> keys = map.keySet();
        //遍历set集合，得到每一个键,根据键获取对应的值
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key+"---"+value);
        }
    }
}
