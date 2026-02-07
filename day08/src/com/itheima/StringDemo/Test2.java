package com.itheima.StringDemo;

public class Test2 {
    public static void main(String[] args) {
        //生成验证码
        System.out.println(getCode(4));

    }
    public static String getCode(int n){
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String code="";
        for (int i = 0; i < n; i++) {
            int number=(int)(Math.random()*str.length());  //[0,1)*50=[0,50)
            code+=str.charAt(number);
        }
        return code;
    }
}
