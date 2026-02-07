package com.itheima;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //二维数组
        printArray();
    }
    public static void printArray(){
        //静态初始化二维数组
        String[][] student ={
                {"张1三","张三","张三"},
                {"张三","张2三","张三"},
                {"张三","张三","张3三"},
        };
        //遍历二维数组
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                //System.out.print(student[i][j]+"\t");  //制表符
                // %-8s 表示：输出字符串，向左对齐，占用 8 个字符宽度
                System.out.printf("%-8s", student[i][j]);
            }
            System.out.println();
        }
        //动态初始化二维数组
        String[][] student1 = new String[3][3];
    }
}
