package com.itheima.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class annotationDemo2 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //目标：搞清楚注解的应用场景，模拟junit框架，有MyTest注解的方法就执行

        //1、获取Class对象
        //2、获取所有方法
        //3、判断方法上是否有MyTest注解
        Class c1 = annotationDemo2.class;
        Method[] methods = c1.getDeclaredMethods();
        for (Method m : methods) {
            if(m.isAnnotationPresent(MyTest.class)){
                //获取到这个方法的注解
                MyTest myTest = m.getDeclaredAnnotation(MyTest.class);
                int count = myTest.count();
                for (int i = 0; i < count; i++) {
                    m.invoke(null);
                }
            }
        }

    }
    @MyTest(count = 3)
    public static void test1(){
        System.out.println("test1执行了");
    }

    //@MyTest
    public static void test2(){
        System.out.println("test2执行了");
    }

    @MyTest
    public static void test3(){
        System.out.println("test3执行了");
    }
}
