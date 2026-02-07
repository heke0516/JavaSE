package com.itheima.FinalDemo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：面向对象编程实现智能家居控制系统

        JD[] jds= new JD[4];  //JD类型的对象数组
        jds[0] = new Wash("洗衣机",false);
        jds[1] = new TV("电视机",false);
        jds[2] = new Lamp("台灯",false);
        jds[3] = new Air("空调",false);
        //为每个设备定义开和关的功能（接口实现）
        //智能控制系统（单例）
        SmartControl sc = SmartControl.getInstance();
        //sc.control(jds[0]);

        //做一个控制界面
        System.out.println("欢迎使用智能家居系统");
        //打印全部设备的开关情况
        while(true){
            sc.printAllStatus(jds);
            System.out.println("请选择设备：");
            Scanner scanner= new Scanner(System.in);
            String command= scanner.next();
            switch (command){
                case "1":
                    sc.control(jds[0]);
                    break;
                case "2":
                    sc.control(jds[1]);
                    break;
                case "3":
                    sc.control(jds[2]);
                    break;
                case "4":
                    sc.control(jds[3]);
                    break;
                case "esc":
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }

    }
}
