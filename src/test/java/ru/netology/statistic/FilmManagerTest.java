package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void withoutAddingFilm() {
        FilmManager manager = new FilmManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addingOneFilm() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Бладшот");
        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addingSevenFilms() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\" ");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Троли. Мировой тур");
        manager.addFilm("Номер один");
        String[] expected = {"Бладшот", "Вперёд", "Отель \"Белград\" ", "Джентельмены", "Человек-невидимка", "Троли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedFilmsMoreTheMaxOutputLimit() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\" ");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Троли. Мировой тур");
        String[] expected = {"Троли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель \"Белград\" ", "Вперёд"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedFilmsLessThanTheMinOutputLimit() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\" ");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель \"Белград\" ", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedFilmsLessThanTheMaxOutputLimit() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\" ");
        manager.addFilm("Джентельмены");
        String[] expected = {"Джентельмены", "Отель \"Белград\" ", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedFilmswithinTheMaxOutputLimit() {
        FilmManager manager = new FilmManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        String[] expected = {"Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void outputTheLastSevenFilms() {
        FilmManager manager = new FilmManager(7);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\" ");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Троли. Мировой тур");
        manager.addFilm("Номер один");
        String[] expected = {"Номер один", "Троли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель \"Белград\" ", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void doNotOutputFilms() {
        FilmManager manager = new FilmManager(0);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\" ");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Троли. Мировой тур");
        manager.addFilm("Номер один");
        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void outputTheLastOneFilms() {
        FilmManager manager = new FilmManager(1);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель \"Белград\" ");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек-невидимка");
        manager.addFilm("Троли. Мировой тур");
        manager.addFilm("Номер один");
        String[] expected = {"Номер один"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

}
