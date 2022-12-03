package com.erivelton.maratonajava.javacore.Csobrecargametodos.test;

import com.erivelton.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Akudama","TV",12);
        anime.imprime();

        Anime anime1 = new Anime();
        anime1.init("Kurama", "Net", 14, "Ação");
        anime1.imprime();

    }
}
