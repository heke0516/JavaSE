package com.itheima;

import java.util.Scanner;

public class branch {
    //认识switch,通过比较值是否相等，来决定执行哪条分支；switch具有穿透性
    public static void main(String[] args) {
        //根据男女性别不同，推荐不同的书本
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入性别：");
        String gender = sc.next();
        switch (gender) {
            case "男":
                System.out.println("推荐《java从入门到放弃》");
                break;
            case "女":
                System.out.println("推荐《java从入门到放弃2》");
                break;
            default:
                System.out.println("请输入正确的性别");
                //默认分支，不用加break
        }
    }
}
