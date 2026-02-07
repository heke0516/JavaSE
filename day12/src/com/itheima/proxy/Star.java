package com.itheima.proxy;

import lombok.Data;

@Data
public class Star implements StarService{
    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void sing(String name) {
        System.out.println(this.name+"正在唱:"+name);
    }

    @Override
    public String dance() {
        System.out.println(this.name+"正在跳舞");
        return "魅力四射";
    }
}
