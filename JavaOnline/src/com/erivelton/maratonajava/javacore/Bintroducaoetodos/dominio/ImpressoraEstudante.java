package com.erivelton.maratonajava.javacore.Bintroducaoetodos.dominio;

public class ImpressoraEstudante {

    public void imprime(Estudante estudante){

        System.out.println("Imprimindo da classe ImpressoraEstudante");


        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
