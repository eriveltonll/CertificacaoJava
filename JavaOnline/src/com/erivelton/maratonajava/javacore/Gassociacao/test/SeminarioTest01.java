package com.erivelton.maratonajava.javacore.Gassociacao.test;

import com.erivelton.maratonajava.javacore.Gassociacao.dominio.Estudante;
import com.erivelton.maratonajava.javacore.Gassociacao.dominio.Local;
import com.erivelton.maratonajava.javacore.Gassociacao.dominio.Professor1;
import com.erivelton.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest01 {

    public static void main(String[] args) {
        Local local = new Local("Rua A, Gov. Valadares");
        Estudante estudante = new Estudante("Gabriel",20);
        Estudante estudante1 = new Estudante("Diego",22);
        Professor1 professor1 = new Professor1("Mestre Erivelton", "Matemática");

        Estudante[] estudantesParaSeminario  = {estudante, estudante1};

        Seminario seminario = new Seminario("Programação Web", estudantesParaSeminario, local);
        Seminario seminario1 = new Seminario("Programação Android", estudantesParaSeminario, local);
        Seminario seminario2 = new Seminario("Programação Desktop", estudantesParaSeminario, local);


        Seminario[] seminariosDisponiveis = {seminario,seminario1,seminario2};

        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprime();


    }
}
