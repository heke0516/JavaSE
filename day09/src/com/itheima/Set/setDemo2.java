package com.itheima.Set;

import java.util.HashSet;
import java.util.Set;

public class setDemo2 {
    public static void main(String[] args) {
        //掌握HashSet集合去重操作
        //对象的地址不一样，但是内容可能一样

        //必须重写equals()和hashCode()方法

        Student s1 = new Student("小z", 19, "上海", "1234567");
        Student s2 = new Student("小q", 18, "北京", "123456");
        Student s3 = new Student("小z", 19, "上海", "1234567");
        Student s4 = new Student("小q", 18, "北京", "123456");

        Set<Student> set = new HashSet<>();  //不重复的！
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);
    }
}
