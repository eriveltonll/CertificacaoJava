package com.erivelton.maratonajava.javacore.Bintroducaoetodos.test;

import com.erivelton.maratonajava.javacore.Bintroducaoetodos.dominio.Calculadora;

public class CalculadoraTest03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.dividiDoisNumeros(20.0, 2.0);
        System.out.println(resultado);

        calculadora.imprimeDivisaoDeDoisNumeros(86,1);
    }
}
