package com.itheima;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        //需求：指定位数的验证码(方法二)
        System.out.println(getCode(4));
        System.out.println(getCode(6));

    }
    public static String getCode(int n){
        String code="";
        Random random = new Random();
        for(int i=0;i<n;i++){
            int type = random.nextInt(3); //0数字、1大写、2小写
            switch (type){
                case 0:
                    code+=random.nextInt(10);
                    break;
                case 1:
                    code+=(char)(random.nextInt(26)+'A');
                    break;
                case 2:
                    code+=(char)(random.nextInt(26)+'a');
                    break;
            }
        }
        return code;
    }
}
