package com.itheima.innerClass;

public class innerClass1 {
    public static void main(String[] args) {
        //搞清楚成员内部类的语法
        //1、成员内部类中可以直接访问外部类的 静态成员，也可以访问外部类的实例成员
        Outer.Inner inner = new Outer().new Inner();

        people.heart h = new people().new heart();
        h.show();
    }
}

class people{
    private int heartBeat=100;
    public class heart{
        private int heartBeat=80;
        public void show(){
            int heartBeat=60;
            System.out.println(heartBeat);  //60
            System.out.println(this.heartBeat);  //80
            System.out.println(people.this.heartBeat);  //100
        }
    }
}
