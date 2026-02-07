package com.itheima.Map;

import java.util.*;

public class mapTest {
    public static void main(String[] args) {
        //目标：完成map集合案例，投票统计程序
        calc();
    }

    private static void calc() {
        //把80个学生选择的景点数据放到nums中
        List<String> allChoices =new ArrayList<>();
        String[] location={"故宫","天安门","圆明园","长城"};
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(location.length); //0 1 2 3
            allChoices.add(location[index]);
        }

        //新建一个Map集合，把景点名称作为键，投票数量作为值，初始值全为0
        Map<String,Integer> map=new HashMap<>();
        //遍历nums集合
        for (String allChoice : allChoices) {
            /*if (map.containsKey(allChoice)){
                //如果键存在，则将值加1
                map.compute(allChoice, (k, value) -> value + 1);
            }else {
                //如果键不存在，则将键值对添加到map集合中
                map.put(allChoice,1);
            }*/
            map.put(allChoice,map.containsKey(allChoice)?map.get(allChoice)+1:1);
        }
        //遍历map集合，获取键和值，并输出最大值
        int max=-1;
        String winner=null;
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Integer value = map.get(key);
            if (value>max){
                max=value;
                winner=key;
            }
            System.out.println(key+"---"+value);
        }
        System.out.println("投票结果是："+winner+"，获得票数是："+max);
    }
}
