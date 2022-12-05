package com.erivelton.maratonajava.javacore.Hheranca.dominio;


/**
 * Toda classe extende de Object, mas fica de forma implicita
 */
public class Pessoa{

    /**
     * Com o protected eu consigo acessar todos os atributos que estiverem dentro do mesmo pacote
     * Ou então se a classe extender a que tem o protectd, mesmo que seja em pacote diferente
     */

    protected String nome;
    protected String cpf;
    protected Endereco endereco;


    static{
        System.out.println("Dentro de bloco estático de pessoa");
    }
    {
        System.out.println("Dentro de bloco inicialização de pessoa 1");
    }
    {
        System.out.println("Dentro de bloco inicialização de pessoa 2");
    }


    public Pessoa(String nome) {
        System.out.println("Dentro de construtor pessoa");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("==== Cadastro ====");
        System.out.println("Nome: "+ this.nome);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("Rua: "+ this.endereco.getRua());
        System.out.println("CEP: "+ this.endereco.getCep());
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
