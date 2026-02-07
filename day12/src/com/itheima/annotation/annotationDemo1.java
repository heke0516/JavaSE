package com.itheima.annotation;


@A("delete")
//@A(value = "delete")
public class annotationDemo1 {
    @MyBook(name = "java", age = 18, address = {"北京", "上海"})
    public static void main(String[] args) {

    }
}
