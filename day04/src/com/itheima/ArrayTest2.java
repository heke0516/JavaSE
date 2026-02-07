package com.itheima;

import java.util.Random;

public class ArrayTest2 {
    public static void main(String[] args) {
        start(4);
    }
    public static void start(int n){
        int[][] arr =new int[n][n];
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=count++;
            }
        }
        printArray(arr);
        //打乱二维数组中的元素顺序
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                Random random=new Random();
                int index1=random.nextInt(n);
                int index2=random.nextInt(n);
                int temp=arr[i][j];
                arr[i][j]=arr[index1][index2];
                arr[index1][index2]= temp;
            }
        }
        System.out.println("打乱后的数组：");
        printArray(arr);

    }
    public static void printArray(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
