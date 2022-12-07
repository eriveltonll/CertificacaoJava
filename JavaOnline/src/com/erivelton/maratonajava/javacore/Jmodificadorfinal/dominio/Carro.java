package com.erivelton.maratonajava.javacore.Jmodificadorfinal.dominio;


/**
 * Caso não queira permitir que a classe carro seja extendida, basta usar FINAL no nome da classe
 * o mesmo serve para métodos, que não consegue sobrescrever se o mesmo estiver com FINAL
 */

public class Carro {
    private String nome;
    /**
     * Constante em Java usa a plavra FINAL e tem que estar sempre associada ao STATIC e por convensão em UPPERCASE
     * Pode iniciar constante da forma como esta abaixo u colocando dentro de um bloco de inicialização STATIC
     * Também é possivel iniciar dentro do CONSTRUTOR
     * Não é possível alterar o valor de varíáveis PRIMITIVAS
     */

    public static final double VELOCIDADE_LIMITE = 250;


    /**
     * CONSTANTE do tipo FINAL para OBJETOS não pode ser alterada a referência, mas você consegue mudar o valor do objeto
     * EXEMPLO DISSO É USANDO O PADRÃO DE PROJETO SINGLETON
     */
    public final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println(this.nome);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
