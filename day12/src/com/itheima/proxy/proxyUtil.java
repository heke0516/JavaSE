package com.itheima.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 代理工具类：代理工具类，用于创建代理对象
* */
public class proxyUtil {
    //创建一个明星对象的的代理对象并返回
    /*
    * 参数一：用于执行哪个类加载器去加载生成的代理类
    * 参数二：代理对象需要实现的接口
    * 参数三：代理对象要做的事情
    * */
    public static StarService createProxy(Star star){
        StarService proxy = (StarService) Proxy.newProxyInstance(proxyUtil.class.getClassLoader(),
                star.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //代理对象要做的事情
                        //参数一：代理对象本身
                        //参数二：被代理对象要调用的方法
                        //参数三：被代理对象要调用的方法的参数
                        String methodName = method.getName();
                        if(methodName.equals("sing")){
                            System.out.println("准备话筒");
                        } else if (methodName.equals("dance")) {
                            System.out.println("准备场地");
                        }

                        //真正干活，调用被代理对象要调用的方法
                        Object result = method.invoke(star, args);
                        return result;
                    }

                });
        return proxy;

    }
}
