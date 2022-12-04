package com.erivelton.maratonajava.javacore.Gassociacao.test;

import com.erivelton.maratonajava.javacore.Gassociacao.dominio.Jogador;
import com.erivelton.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Cafu");
        Time time = new Time("Brasil");

        Jogador[] jogadores = {jogador1,jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("----Jogador-------");
        jogador1.imprime();
        jogador2.imprime();

        System.out.println("----Time-------");
        time.imprime();




    }
}
