package com.erivelton.maratonajava.javacore.Gassociacao.test;

import com.erivelton.maratonajava.javacore.Gassociacao.dominio.Escola;
import com.erivelton.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {

    public static void main(String[] args) {
        Professor professor = new Professor("Erivelton");
        Professor professor2 = new Professor("Elisson");
        Professor[] professores = {professor, professor2};

        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }
}
