package com.itheima.enumDemo;

public class Test2 {
    public static void main(String[] args) {
        //目标：掌握枚举类的应用场景：做信息的分类和标志
        //需求：模拟上下左右移动图片
        //方法一：用常量,但参数值不受约束
        move1(Constant.up);
        //move1(0);
        //方法二：用枚举类，参数值有约束
        move2(Direction.UP);

    }
    public static void move2(Direction direction) {
        //根据direction的值，模拟移动图片
        switch (direction) {
            case Direction.UP:
                System.out.println("向上移动");
                break;
            case Direction.DOWN:
                System.out.println("向下移动");
                break;
            case Direction.LEFT:
                System.out.println("向左移动");
                break;
            case Direction.RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
                break;
        }
    }

    public static void move1(int direction) {
        //根据direction的值，模拟移动图片
        switch (direction) {
            case 0:
                System.out.println("向上移动");
                break;
            case 1:
                System.out.println("向下移动");
                break;
            case 2:
                System.out.println("向左移动");
                break;
            case 3:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("无效的移动方向");
                break;
        }
    }
}
