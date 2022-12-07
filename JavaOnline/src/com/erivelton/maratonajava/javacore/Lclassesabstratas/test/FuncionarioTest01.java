package com.erivelton.maratonajava.javacore.Lclassesabstratas.test;

import com.erivelton.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import com.erivelton.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gabriel", 1000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Erivelton", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();

    }
}
