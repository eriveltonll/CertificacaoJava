package com.erivelton.maratonajava.javacore.Bintroducaoetodos.dominio;

public class FuncionarioPrivado {


    private String nome = null;
    private int idade = 0;
    private double[] salario = null;
    private double mediaSalario;

    public void imprimeDados() {

        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        if (this.salario == null) {
            return;
        }
        for (int i = 0; i < this.salario.length; i++)
            System.out.println("Salário " + (i + 1) + " R$ " + this.salario[i]);
    }

    public void mediaSalarios() {

        if (this.salario == null)
            return;

        for (double sal : this.salario) {
            this.mediaSalario += sal;
        }
        this.mediaSalario /= this.salario.length;
        System.out.println("Média dos salários - R$ " + this.mediaSalario);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMediaSalario() {
        return mediaSalario;
    }

   /* public void setMediaSalario(double mediaSalario) {
        this.mediaSalario = mediaSalario;
    }*/
}
