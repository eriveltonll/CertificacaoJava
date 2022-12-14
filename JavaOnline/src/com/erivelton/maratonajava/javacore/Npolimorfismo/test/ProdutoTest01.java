package com.erivelton.maratonajava.javacore.Npolimorfismo.test;

import com.erivelton.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.erivelton.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import com.erivelton.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import com.erivelton.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NVC2022", 11000);
        Tomate tomate = new Tomate("Cereja", 8.90);
        Televisao televisao = new Televisao("Samsung 50\"", 5000);
        //CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------");
        //CalculadoraImposto.calcularImpostoTomate(tomate);
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
