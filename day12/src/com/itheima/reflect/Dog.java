package com.itheima.reflect;

public class Dog {
    private String name;
    private int age;

    private Dog(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    private void eat(){
        System.out.println("狗吃骨头");
    }
    private String eat(String food){
        System.out.println("狗吃"+ food);
        return "吃饱了";
    }

}
