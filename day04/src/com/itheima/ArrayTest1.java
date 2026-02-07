package com.itheima;

import java.util.Random;

public class ArrayTest1 {
    public static void main(String[] args) {
        //斗地主做牌、洗牌
        start();
    }
    public static void start(){
        String[] pokers=new String[54];
        //四种花色
        String[] colors={"♠","♥","♣","♦"};
        //点数
        String[] numbers={"K","Q","J","10","9","8","7","6","5","4","3","2","A"};

        //遍历花色，再遍历点数，存入pokers中
        int index=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<colors.length;j++){
                pokers[index++]=colors[j]+numbers[i];
            }
        }
        pokers[index++]="大王";
        pokers[index]="小王";
        System.out.println("牌组生成完毕 ：");
        for (int i = 0; i < pokers.length; i++) {
            System.out.println(pokers[i]);
        }
        System.out.println("洗牌开始 ：");
        for(int i=0;i<pokers.length;i++){
            Random random=new Random();
            int x=random.nextInt(pokers.length);
            exchange(pokers,i,x);
//            String temp=pokers[i];
//            pokers[i]=pokers[x];
//            pokers[x]=temp;
        }
        System.out.println("洗牌结束 ：");
        for (int i = 0; i < pokers.length; i++) {
            System.out.println(pokers[i]);
        }
    }
    public static void exchange(String[] array,int a,int b){
        String temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}
