package ru.netology.MovieManager;

public class MovieManager {
    private String[] films = new String[0];
    private int limit;

    public MovieManager() {
        this.limit = 5;

    }

    public MovieManager(int limit) {
        this.limit = limit;

    }


    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;


    }

    public String[] findAll() {
        return films;

    }

    public String[] findLast() {
        int arrayResult;
        if (films.length < limit) {
            arrayResult = films.length;
        } else {
            arrayResult = limit;
        }

        String[] tmp = new String[arrayResult];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];

        }

        return tmp;
    }

}
