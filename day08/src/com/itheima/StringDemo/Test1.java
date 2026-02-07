package com.itheima.StringDemo;

public class Test1 {
    public static void main(String[] args) {
        //简易登录系统
//        String OKusername="admin";
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入用户名：");
//        String username=sc.next();
//        if(username.equals(OKusername)){  //字符串比较相等要用equals()方法
//            System.out.println("登录成功！");
//        }else{
//            System.out.println("用户名输入错误！");
//        }
        //字符串替换
        String phone="13730018763";
        System.out.println(phone.substring(0,3)+"****"+phone.substring(7));
    }
}
