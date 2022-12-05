package com.erivelton.maratonajava.javacore.Hheranca.test;

import com.erivelton.maratonajava.javacore.Hheranca.dominio.Endereco;
import com.erivelton.maratonajava.javacore.Hheranca.dominio.Funcionario;
import com.erivelton.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01234-000");
        Pessoa pessoa = new Pessoa("Erivelton");
        //pessoa.setNome("Erivelton");
        pessoa.setCpf("12345678910");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Elisson");
        //funcionario.setNome("Elisson");
        funcionario.setCpf("1233");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();

        funcionario.relatorioPagamento();
    }
}