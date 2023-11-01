package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesManagerTest {

    @Test
    public void findAllTest() {
        MoviesManager manager = new MoviesManager();
        String movies1 = "Bloodshot";
        String movies2 = "Forward";
        String movies3 = "Hotel Belgrade";
        String movies4 = "Gentlemen";
        String movies5 = "Invisible Man";
        String movies6 = "Trolls";
        String movies7 = "Number One";

        manager.add(movies1);
        manager.add(movies5);
        manager.add(movies3);
        manager.add(movies6);

        String[] actual = manager.findAll();
        String[] expected = {movies1, movies5, movies3, movies6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllMovies() {
        MoviesManager manager = new MoviesManager();
        String movies1 = "Bloodshot";
        String movies2 = "Forward";
        String movies3 = "Hotel Belgrade";
        String movies4 = "Gentlemen";
        String movies5 = "Invisible Man";
        String movies6 = "Trolls";
        String movies7 = "Number One";

        manager.add(movies1);
        manager.add(movies2);
        manager.add(movies3);
        manager.add(movies4);
        manager.add(movies5);
        manager.add(movies6);
        manager.add(movies7);

        String[] actual = manager.findAll();
        String[] expected = {movies1, movies2, movies3, movies4, movies5, movies6, movies7};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void findAllTestLimit() {
        MoviesManager manager = new MoviesManager();
        String movies1 = "Bloodshot";
        String movies2 = "Forward";
        String movies3 = "Hotel Belgrade";
        String movies4 = "Gentlemen";
        String movies5 = "Invisible Man";
        String movies6 = "Trolls";
        String movies7 = "Number One";

        manager.add(movies1);
        manager.add(movies2);
        manager.add(movies3);
        manager.add(movies4);
        manager.add(movies5);

        String[] actual = manager.findLast();
        String[] expected = {movies5, movies4, movies3, movies2, movies1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllTestMoreLimit() {
        MoviesManager manager = new MoviesManager();
        String movies1 = "Bloodshot";
        String movies2 = "Forward";
        String movies3 = "Hotel Belgrade";
        String movies4 = "Gentlemen";
        String movies5 = "Invisible Man";
        String movies6 = "Trolls";
        String movies7 = "Number One";

        manager.add(movies1);
        manager.add(movies2);
        manager.add(movies3);


        String[] actual = manager.findLast();
        String[] expected = {movies3, movies2, movies1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMSMovies() {
        MoviesManager manager = new MoviesManager();
        String movies1 = "Bloodshot";
        String movies2 = "Forward";
        String movies3 = "Hotel Belgrade";
        String movies4 = "Gentlemen";
        String movies5 = "Invisible Man";
        String movies6 = "Trolls";
        String movies7 = "Number One";

        manager.add(movies1);
        manager.add(movies2);
        manager.add(movies3);
        manager.add(movies4);
        manager.add(movies5);
        manager.add(movies6);
        manager.add(movies7);

        String[] actual = manager.findLast();
        String[] expected = {movies7, movies6, movies5, movies4, movies3};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findAllTestLimitConstr() {
        MoviesManager manager = new MoviesManager(7);
        String movies1 = "Bloodshot";
        String movies2 = "Forward";
        String movies3 = "Hotel Belgrade";
        String movies4 = "Gentlemen";
        String movies5 = "Invisible Man";
        String movies6 = "Trolls";
        String movies7 = "Number One";

        manager.add(movies1);
        manager.add(movies2);
        manager.add(movies3);
        manager.add(movies4);
        manager.add(movies5);

        String[] actual = manager.findLast();
        String[] expected = {movies5, movies4, movies3, movies2, movies1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllTestMoreLimitConstr() {
        MoviesManager manager = new MoviesManager(3);
        String movies1 = "Bloodshot";
        String movies2 = "Forward";
        String movies3 = "Hotel Belgrade";
        String movies4 = "Gentlemen";
        String movies5 = "Invisible Man";
        String movies6 = "Trolls";
        String movies7 = "Number One";

        manager.add(movies1);
        manager.add(movies2);
        manager.add(movies3);


        String[] actual = manager.findLast();
        String[] expected = {movies3, movies2, movies1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMSMoviesConstr() {
        MoviesManager manager = new MoviesManager(3);
        String movies1 = "Bloodshot";
        String movies2 = "Forward";
        String movies3 = "Hotel Belgrade";
        String movies4 = "Gentlemen";
        String movies5 = "Invisible Man";
        String movies6 = "Trolls";
        String movies7 = "Number One";

        manager.add(movies1);
        manager.add(movies2);
        manager.add(movies3);
        manager.add(movies4);
        manager.add(movies5);
        manager.add(movies6);
        manager.add(movies7);

        String[] actual = manager.findLast();
        String[] expected = {movies7, movies6, movies5};

        Assertions.assertArrayEquals(expected, actual);
    }

}