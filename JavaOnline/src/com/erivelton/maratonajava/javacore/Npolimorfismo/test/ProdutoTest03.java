package com.erivelton.maratonajava.javacore.Npolimorfismo.test;

import com.erivelton.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.erivelton.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.erivelton.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import com.erivelton.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {

    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 9", 3000);


        Tomate tomate = new Tomate("Tomate Uva", 5);
        tomate.setDataValidade("31/12/2022");

        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("--------------------------");

        CalculadoraImposto.calcularImposto(produto1);




    }
}
