package com.itheima.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflectDemo2 {
    @Test
    public void getClassInfo() {
        //目标：获取类的信息
        //1、获取Class对象，代表拿到类
        Class c1 = Student.class;
        System.out.println(c1.getName());  //com.itheima.reflect.Student
        System.out.println(c1.getSimpleName());  // Student
    }

    //2、获取类的构造器对象
    @Test
    public void getConstructorInfo() throws NoSuchMethodException {
        Class c1 = Dog.class;
        Constructor[] cons = c1.getDeclaredConstructors();
        for (Constructor c : cons) {
            System.out.println(c.getName()+"("+c.getParameterCount()+")");
        }
        System.out.println("--------------------------------");
        //获取单个构造器对象
        Constructor con1 = c1.getDeclaredConstructor(String.class, int.class);//获取有参构造器对象
        System.out.println(con1.getName()+"("+con1.getParameterCount()+")");
        Constructor con2 = c1.getDeclaredConstructor();//获取无参构造器对象
        System.out.println(con2.getName()+"("+con2.getParameterCount()+")");
    }

    //3、获取类的成员变量对象
    @Test
    public void getFieldInfo() throws NoSuchFieldException {
        Class c1 = Dog.class;
        Field[] fields = c1.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName()+"("+f.getType()+")");
        }
        //获取单个成员变量对象
        Field f1 = c1.getDeclaredField("name");
        System.out.println(f1.getName()+"("+f1.getType()+")");
    }

    //4、获取类的成员方法对象
    @Test
    public void getMethodInfo() throws NoSuchMethodException {
        Class c1 = Dog.class;
        Method[] methods = c1.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName()+"("+m.getParameterCount()+")");
        }
    }
}
