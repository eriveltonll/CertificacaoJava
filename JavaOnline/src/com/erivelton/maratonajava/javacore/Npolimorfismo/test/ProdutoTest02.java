package com.erivelton.maratonajava.javacore.Npolimorfismo.test;

import com.erivelton.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import com.erivelton.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import com.erivelton.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {

    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 9", 3000);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());

        System.out.println("-------------------");


        Produto produto2 = new Tomate("Uva", 5);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());



    }
}
