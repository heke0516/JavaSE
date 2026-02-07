package com.itheima.VariableParaMethod;

public class Demo1 {
    public static void main(String[] args) {
        //认识可变参数方法
        sum();
        sum(1);
        sum(1,2);
        sum(1,2,3);
        sum(new int[]{1,2,3});
    }

    //注意：可变参数在形参列表中只能有一个！可变参数只能放在形参列表的最后一个位置！
    private static void sum(int...nums) {
    }
}
