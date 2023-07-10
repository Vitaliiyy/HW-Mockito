package ru.netology.MovieManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MovieManagerTest {

    @Test
    public void addOneFilm() {
        MovieManager manager = new MovieManager();

        manager.addFilm("Film 1");

        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addThreeFilms() {
        MovieManager manager = new MovieManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addLowerLimitFilms() {
        MovieManager manager = new MovieManager(6);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addNullLimitFilms() {
        MovieManager manager = new MovieManager(0);



        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addMaxLimitFilms() {
        MovieManager manager = new MovieManager(5);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

//    @Test
//    public void addOverLimitFilms(){
//        MovieManager manager = new MovieManager(5);
//
//        manager.addFilm("Film 1");
//        manager.addFilm("Film 2");
//        manager.addFilm("Film 3");
//        manager.addFilm("Film 4");
//        manager.addFilm("Film 5");
//        manager.addFilm("Film 6");
//
//        String[] expected = {"array lengths differ, expected: <5> but was: <6>"};
//        String[] actual = manager.findAll();
//        Assertions.assertArrayEquals(expected, actual);
//
//    }

    @Test
    public void addNullFilms() {
        MovieManager manager = new MovieManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void findLastThree() {
        MovieManager manager = new MovieManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");


        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastOne() {
        MovieManager manager = new MovieManager(1);


        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");


        String[] expected = {"Film 3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastNull() {
        MovieManager manager = new MovieManager();


        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

}
