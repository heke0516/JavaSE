package com.itheima.polymorphsm2;

public class test {
    public static void main(String[] args) {
        //目标：认识多态，多态是在继承/实现情况下的一种现象，表现为：对象多态、行为多态
        //对象多态，行为多态
        //多态的用处：在多态形式下，右边对象是解耦合的，更便于扩展和维护
        Animal r = new rabbit();
        r.run();  //方法：编译看左边，运行看右边
        System.out.println(r.name);  //成员变量：编译看左边，运行也看左边
        Animal t=new tortoise();
        t.run();
        //t.shrink();  //报错，多态下不能调用子类独有的功能
        System.out.println(t.name);


        go(r);
        go(t);

    }
    public static void go(Animal a){  //多态的用处2：父类类型的变量作为参数，可以接收子类对象
        System.out.println("开始------");
        a.run();
    }

}
