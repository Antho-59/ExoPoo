package org.example.exoFilm;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Film film = new Film("MIB","quelqu'un", LocalDate.of(1995,5,31),"SciFi");

        System.out.println(film);
    }
}
