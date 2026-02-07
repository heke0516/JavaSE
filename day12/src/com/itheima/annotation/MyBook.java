package com.itheima.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)  //注解注解的作用范围
@Retention(RetentionPolicy.RUNTIME)  //注解的保留时间
public @interface MyBook {
    String name(); //属性后加 ()
    int age() default 18;
    String[] address();
}
