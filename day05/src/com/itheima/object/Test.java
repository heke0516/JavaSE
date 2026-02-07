package com.itheima.object;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();
        s1.name = "播仔";
        s1.age = 18;
        s1.math = 100;
        s1.english = 60;
        System.out.println(s1.name+"的总分是："+allScore(s1));
        System.out.println(s1.name+"的均分是："+averageScore(s1));

        Student s2 = new Student();
        s2.name = "播妞";
        s2.age = 19;
        s2.math = 80;
        s2.english = 90;
        System.out.println(s2.name+"的总分是："+allScore(s2));
        System.out.println(s2.name+"的均分是："+averageScore(s2));

    }
    public static double allScore(Student s){
        return s.math+s.english;
    }
    public static double averageScore(Student s){
        return (s.math+s.english)/2;
    }
}
