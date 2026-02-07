package com.itheima.abstractDemo2;

public abstract class People {
    public final void classroom() {
        System.out.println("上课来教室");
        //每个子类做的不同，父类定义一个抽象方法，具体实现交给子类来重写
        classroomMain();
        System.out.println("下课离开");
    }
    public abstract void classroomMain();
}
