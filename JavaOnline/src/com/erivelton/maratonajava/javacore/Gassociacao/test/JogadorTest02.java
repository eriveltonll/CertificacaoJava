package com.erivelton.maratonajava.javacore.Gassociacao.test;

import com.erivelton.maratonajava.javacore.Gassociacao.dominio.Jogador;
import com.erivelton.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Brasil");

        jogador1.setTime(time);
        jogador1.imprime();

    }
}
