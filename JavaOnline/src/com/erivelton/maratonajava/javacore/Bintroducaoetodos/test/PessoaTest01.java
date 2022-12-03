package com.erivelton.maratonajava.javacore.Bintroducaoetodos.test;

import com.erivelton.maratonajava.javacore.Bintroducaoetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Erivelton");
        pessoa.setIdade(38);

        //pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
