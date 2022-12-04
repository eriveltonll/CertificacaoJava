package com.erivelton.maratonajava.javacore.Gassociacao.test;

import com.erivelton.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Romário");
        Jogador j2 = new Jogador("Pelé");
        Jogador j3 = new Jogador("Cafú");

        Jogador[] jogadores = {j1, j2, j3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();

        }


    }
}
