package com.erivelton.maratonajava.javacore.Bintroducaoetodos.test;


import com.erivelton.maratonajava.javacore.Bintroducaoetodos.dominio.FuncionarioPrivado;

public class FuncionarioPrivadoTest01 {
    public static void main(String[] args) {
        FuncionarioPrivado funcionarioPrivado = new FuncionarioPrivado();

        funcionarioPrivado.setNome("Erivelton");
        funcionarioPrivado.setIdade(38);
        funcionarioPrivado.setSalario(new double[] {1200.00,1252.00,2530.00});


        funcionarioPrivado.imprimeDados();
        System.out.println("===========================");
        funcionarioPrivado.mediaSalarios();

    }
}
