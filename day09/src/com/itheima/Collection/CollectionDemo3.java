package com.itheima.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo3 {
    public static void main(String[] args) {
        //遍历集合的同时又存在增删集合元素的行为时可能会出现业务异常，这种现象称为并发修改异常问题
        //需求：删除所有枸杞
        List<String> list=new ArrayList<>();
        list.add("java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特技枸杞");
        list.add("西洋参");
        /*for(int i=0;i<list.size();i++){
            String s=list.get(i);
            if (s.contains("枸杞")){
                list.remove(s);
            }
        }*/
        //System.out.println(list);  //[java入门, 黑枸杞, 人字拖, 西洋参]
        //原因：删除集合中的一个元素后，后面的元素会往前补位
        //修改方法：i--
        /*for(int i= list.size()-1;i>=0;i--){
            String s=list.get(i);
            if (s.contains("枸杞")){
                list.remove(s);
            }
        }
        System.out.println(list);  //[java入门, 人字拖, 西洋参]*/

        //用迭代器遍历并删除默认也存在并发修改异常问题
        //使用迭代器自己的方法来删除可以解决
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if (s.contains("枸杞")){
                it.remove();  //有i--的操作
            }
        }
        System.out.println(list);  //[java入门, 人字拖, 西洋参]
    }
}
