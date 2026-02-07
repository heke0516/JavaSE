package com.itheima.MovieMessageManager;

public class Test {
    public static void main(String[] args) {
        //目标：完成电影信息管理
        //1、创建电影类
        //2、创建一个操作对象，对数据进行业务处理
        MovieService movieService = new MovieService();
        movieService.start();
    }
}
