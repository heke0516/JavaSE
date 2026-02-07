package com.itheima.Test;

import java.util.Scanner;

public class MoviesOperater {
    private Movies[] movies;

    public MoviesOperater(Movies[] movies) {
        this.movies = movies;
    }

    public void showMovies() {
        for (int i = 0; i < movies.length; i++) {
            Movies movie = movies[i];
            System.out.println(movie.getName() + "\t" + movie.getPrice() + "\t" + movie.getId() + "\t" + movie.getActor());
        }
    }

    public void findMoviesByid() {
        System.out.println("请输入要查询的id：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movies movie = movies[i];
            if (movie.getId() == id) {
                System.out.println(movie.getName() + "\t" + movie.getPrice() + "\t" + movie.getId() + "\t" + movie.getActor());
            }
        }
    }
}
