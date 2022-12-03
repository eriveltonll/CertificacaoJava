package com.erivelton.maratonajava.javacore.Bintroducaoetodos.test;

import com.erivelton.maratonajava.javacore.Bintroducaoetodos.dominio.Calculadora;

public class CalculadoraTest04 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int n1 = 1;
        int n2 =2;
        calculadora.alteraDoisNumeros(n1,n2);
        System.out.println("Dentro do CalculadoraTest04");
        System.out.println("Num1 "+ n1);
        System.out.println("Num2 "+ n2);
    }
}
