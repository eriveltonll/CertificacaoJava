package com.erivelton.maratonajava.javacore.Eblocoinicializacao.test;


import com.erivelton.maratonajava.javacore.Eblocoinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        //Anime anime = new Anime("One Piece");
        Anime anime = new Anime();

        System.out.println("Antes do for do AnimeTest01");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }


    }
}
