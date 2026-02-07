package com.itheima.FinalDemo;

public class GoldCard extends  card{

    public GoldCard(String carId, String name, String phone, double  money) {
        super(carId, name, phone, money);
    }

    @Override
    public void payMoney(double money) {
        System.out.println("您当前消费"+ money);
        System.out.println("优惠后的价格"+ money * 0.8);
        if(getMoney()<money*0.8){
            System.out.println("余额不足");
            return;
        }
        //更新余额
        setMoney(getMoney()-money*0.8);
        //判断单次消费是否大于200，打印洗车票
        if(money*0.8>=200){
            printTicket();
        }
    }

    private void printTicket() {
        System.out.println("恭喜您，本次消费成功，请到店洗车");
    }


}
