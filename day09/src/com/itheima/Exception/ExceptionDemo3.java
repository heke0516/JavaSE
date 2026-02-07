package com.itheima.Exception;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        //目标：认识自定义异常
        try {
            checkAge(234);
            System.out.println("年龄保存成功");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("年龄保存失败");
        }
    }

    //年龄小于1或者大于200就是一个异常
    public static void checkAge(int age) throws AgeIllegalException {
        if(age<1||age>200){
            throw new AgeIllegalException("年龄异常！应当大于1小于200");
        }else{
            System.out.println("年龄正常");
        }
    }
}
