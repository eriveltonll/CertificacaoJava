package com.erivelton.maratonajava.javacore.Lclassesabstratas.dominio;


/**
 * Classe abstrada pode ser extendida mas não pode ser instanciada com NEW
 * Não pode misturar final com abstract pois tem objetivos opostos
 * Métodos abstratos não pode ter corpo
 * Classes abstratas não pode ser instanciada
 * Métodos abstratos só podem existir dentros de classes abstratas
 * Classes abastatas podem ter métodos abstratos e concretos
 * REGRAS
 * Uma classe abastrata que extende outra classe abstrada, é necessário que seja implementa o método de sobrescrita
 * da classe avô, ela pode ser implementada pela classe pai ou pelas classes filhas
 * */
public abstract class Funcionario extends Pessoa {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();

    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo ...");
    }
}
