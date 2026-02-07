package com.itheima.MovieMessageManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    //准备一个集合容器，存储电影信息
    private static List<Movie> movies = new ArrayList<>();
    public void start() {
        while (true) {
            System.out.println("电影信息管理系统启动成功...");
            System.out.println("1.添加电影");
            System.out.println("2.下架电影");
            System.out.println("3.查询电影");
            System.out.println("4.封杀明星");
            System.out.println("5.退出系统");
            System.out.println("请您输入命令：");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    removeMovie();
                    break;
                case 3:
                    findMovie();
                    break;
                case 4:
                    killActor();
                    break;
                case 5:
                    System.out.println("感谢使用电影信息管理系统，即将退出！");
                    return;
                default:
                    System.out.println("输入命令有误，请重新输入");
            }
        }

    }

    private void killActor() {
        System.out.println("请输入要封杀的明星：");
        String name = new Scanner(System.in).next();
        for (Movie movie : movies) {
            if (movie.getActor().equals(name)) {
                movies.remove(movie);
                System.out.println("封杀成功！");
                return;
            }
        }
    }

    private void findMovie() {
        System.out.println("请输入电影名称：");
        String name = new Scanner(System.in).next();
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                System.out.println("电影："+movie.getName()+" 价格："+movie.getPrice()+" 评分："+movie.getScore()+" 主演："+movie.getActor());
            }
        }
        System.out.println("没有找到该电影！");
    }

    private void removeMovie() {
        System.out.println("请输入电影名称：");
        String name = new Scanner(System.in).next();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getName().equals(name)) {
                movies.remove(i);
                System.out.println("下架成功！");
                return;
            }
        }
    }

    private void addMovie() {
        Movie movie = new Movie();
        System.out.println("请输入电影名称：");
        movie.setName(new Scanner(System.in).next());
        System.out.println("请输入电影价格：");
        movie.setPrice(new Scanner(System.in).nextDouble());
        System.out.println("请输入电影主演：");
        movie.setActor(new Scanner(System.in).next());
        System.out.println("请输入电影评分：");
        movie.setScore(new Scanner(System.in).nextDouble());
        movies.add(movie);
        System.out.println("添加成功！");
    }
}
