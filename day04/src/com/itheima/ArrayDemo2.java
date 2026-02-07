package com.itheima;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //动态初始化数组
        // 类似int[] arr = new int[5];
        double[] scores=new double[8];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<scores.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩：");
            scores[i]=sc.nextDouble();
        }
        double max=scores[0], min=scores[0],average = 0;
        for (int i = 0; i < scores.length; i++){
            if(scores[i]>max){
                max=scores[i];
            }
            if(scores[i]<min){
                min=scores[i];
            }
            average+=scores[i];
        }
        System.out.println("最大值："+max);
        System.out.println("最小值："+min);
        System.out.println("平均值："+average/scores.length);


    }
}
