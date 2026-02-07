package com.itheima.Test;

public class test {
    public static void main(String[] args) {
        //创建对象
        Movies[] movies = new Movies[6];
        movies[0] = new Movies("唐顿庄园1", 9.5, 1, "Tim Allen");
        movies[1] = new Movies("唐顿庄园2", 9.5, 2, "Tim Allen");
        movies[2] = new Movies("唐顿庄园3", 9.5, 3, "Tim Allen");
        movies[3] = new Movies("唐顿庄园4", 9.5, 4, "Tim Allen");
        movies[4] = new Movies("唐顿庄园5", 9.5, 5, "Tim Allen");
        movies[5] = new Movies("唐顿庄园6", 9.5, 6, "Tim Allen");

        MoviesOperater operater = new MoviesOperater(movies);
        operater.showMovies();
        operater.findMoviesByid();
    }
}
