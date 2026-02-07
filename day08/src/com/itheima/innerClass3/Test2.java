package com.itheima.innerClass3;

public class Test2 {
    public static void main(String[] args) {
        //目标：搞清楚匿名内部类的使用形式，通常可以作为一个对象参数传输给方法使用
        //需求：老师、学生游泳
        Swim s1=new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师开始游...");
            }
        };
        start(s1);

        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生开始游...");
            }
        });

    }
    public static void start(Swim s){
        System.out.println("开始游...");
        s.swimming();
        System.out.println("结束游...");
}


}
interface Swim{
    void swimming();
}
