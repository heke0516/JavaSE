package com.itheima.FinalDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // lombok技术可以自动添加getter和setter方法，无参构造方法，toString方法等
@NoArgsConstructor  // 无参构造方法
@AllArgsConstructor  // 有参构造方法
public class card {
    private String carId;  //车牌号
    private String name;  //车主姓名
    private String phone;  //手机号
    private double money;  //余额

    //预存金额方法
    public void saveMoney(double money){
        this.money += money;
    }

    //消费金额 方法
    public void payMoney(double money){
        this.money -= money;
    }
}

