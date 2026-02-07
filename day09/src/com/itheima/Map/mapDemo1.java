package com.itheima.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class mapDemo1 {
    public static void main(String[] args) {
        //目标：认识map集合
        //HashMap: 无序，不重复(键不可以重复，值可以重复)，无索引
        //LinkedHashMap: 有序，不重复，无索引（每个元素都额外多了一个双链表的机制，记录它前后元素的位置）
        //TreeMap: 排序，不重复，无索引(基于红黑树实现的排序)

        //Map<String,Integer> map=new HashMap<>();  //一行经典代码
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("嫦娥",22);
        map.put("嫦娥",25);
        map.put("女儿国王",28);
        map.put("紫霞",26);
        map.put("铁扇公主",38);
        map.put(null,null);
        System.out.println(map);
        System.out.println(map.keySet());  //提取所有键  map.keySet()是set类型的，因为键是不重复、无索引的
        System.out.println(map.values());  //提取所有值  map.values()是collection类型的，因为值有可能重复
    }
}
