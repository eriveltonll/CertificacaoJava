package com.erivelton.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int epsodios;
    private String genero;
    private String estudio;


    public Anime(String nome, String tipo, int epsodios, String genero) {

        /**
         * Para chamar um construtor que está dentro de outro construtor
         * Obrigatoriamente o this() tem que ser a primeira linha de um construtor
         */
        this(); 
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int epsodios, String genero, String estudio) {

        this(nome, tipo, epsodios, genero);
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumento");
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.genero);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpsodios() {
        return epsodios;
    }

    public void setEpsodios(int epsodios) {
        this.epsodios = epsodios;
    }
}
