package com.itheima.proxy;

public class proxyDemo1 {
    public static void main(String[] args) {
        Star star = new Star("李彦江");
        StarService proxy = proxyUtil.createProxy(star);
        proxy.sing("冰雨");
        proxy.dance();
        System.out.println(proxy.dance());
    }
}
