package com.itheima.Exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            System.out.println(div(10,0));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现了异常");
        }
        System.out.println("结束");
    }
    public static int div(int a,int b) throws Exception {
        if(b==0){
            //返回一个异常给调用者
            throw new Exception("除数不能为0");
        }
        return a/b;
    }
}
