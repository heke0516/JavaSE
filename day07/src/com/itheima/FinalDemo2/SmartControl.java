package com.itheima.FinalDemo2;

public class SmartControl {
    //设计成单例类
    private static final SmartControl sc = new SmartControl();  //保证只构造一个对象
    private SmartControl(){}
    public static SmartControl getInstance(){  //构造对象的方法
        return sc;
    }
    public void control(JD jd) {  //多态
        //System.out.println(jd.getName() + "现在" + (jd.isStatus() ? "开" : "关")+"着");
        //System.out.println("开始您的操作：");
        jd.press();
        //System.out.println(jd.getName() + "现在" + (jd.isStatus() ? "开" : "关")+"着");
    }

    public void printAllStatus(JD[] jds) {
        for (int i = 0; i < jds.length; i++) {
            JD jd = jds[i];
            System.out.println((i+1)+jd.getName() + "现在" + (jd.isStatus() ? "开" : "关")+"着");
        }
    }
}
