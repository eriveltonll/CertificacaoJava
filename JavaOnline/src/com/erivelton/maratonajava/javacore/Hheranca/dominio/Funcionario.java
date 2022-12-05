package com.erivelton.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{

    private double salario;


    static{
        System.out.println("Dentro de bloco estático de Funcionario");
    }
    {
        System.out.println("Dentro de bloco inicialização de Funcionario 1");
    }
    {
        System.out.println("Dentro de bloco inicialização de Funcionario 2");
    }



    public Funcionario(String nome){
        /**
         * super sem método usado no construtor.
         */
        super(nome);
        System.out.println("Dentro do construtor de Funcionário");
    }


    public void imprime(){
        /**
         * O super() é usado quando eu quero usar algo que venha da herança (superclasse)
         * antes de usar o que fiz abaixo do super.imprime();
         * Para este exemplo é para chamar algum método
         */
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamento(){

        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
