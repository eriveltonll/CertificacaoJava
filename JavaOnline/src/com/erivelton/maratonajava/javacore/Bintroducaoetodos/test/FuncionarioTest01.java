package com.erivelton.maratonajava.javacore.Bintroducaoetodos.test;

import com.erivelton.maratonajava.javacore.Bintroducaoetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Erivelton";
        funcionario.idade = 38;
        funcionario.salario = new double[] {1200.00,1252.00,2530.00};


        funcionario.imprimeDados();
        System.out.println("===========================");
        funcionario.mediaSalarios();

    }
}
