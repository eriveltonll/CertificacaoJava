package com.erivelton.maratonajava.javacore.Bintroducaoetodos.dominio;

public class Funcionario {


    public String nome = null;
    public int idade = 0;
    public double[] salario = null;

    public void imprimeDados() {

        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        if (this.salario == null) {
            return;
        }
        for (int i = 0; i < salario.length; i++)
            System.out.println("Salário " + (i + 1) + " R$ " + this.salario[i]);
    }

    public void mediaSalarios() {

        if (this.salario == null)
            return;
        double mediaSalario = 0;
        for (double sal : salario) {
            mediaSalario += sal;
        }
        mediaSalario /= salario.length;
        System.out.println("Média dos salários - R$ " + mediaSalario);
    }

}
