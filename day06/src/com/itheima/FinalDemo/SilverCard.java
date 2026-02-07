package com.itheima.FinalDemo;

public class SilverCard extends  card{
    public SilverCard(String carId, String name, String phone, double  money) {
        super(carId, name, phone, money);
    }

    @Override
    public void payMoney(double money) {
        System.out.println("您当前消费"+ money);
        System.out.println("优惠后的价格"+ money * 0.9);
        if(getMoney()<money*0.9){
            System.out.println("余额不足");
            return;
        }
        //更新余额
        setMoney(getMoney()-money*0.9);
    }
}
