package com.erivelton.maratonajava.javacore.Bintroducaoetodos.test;

import com.erivelton.maratonajava.javacore.Bintroducaoetodos.dominio.Estudante;
import com.erivelton.maratonajava.javacore.Bintroducaoetodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Erivelton";
        estudante01.idade = 38;
        estudante01.sexo = 'M';

        estudante02.nome = "Paula";
        estudante02.idade = 27;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();

    }
}
