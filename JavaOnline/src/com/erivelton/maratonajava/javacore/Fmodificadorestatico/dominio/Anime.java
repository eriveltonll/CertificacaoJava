package com.erivelton.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 Bloco de inicialização é executado quando a JVM carregar classe (static carrega promeiro uma única vez)
    // 1 Alocado espaco em memoria pro objeto
    // 2 Cada atributo de classe é criado e inicializado com valores default ou o que for passada
    // 3 Bloco de inicialização é executado
    // 4 O construtor é executado


    //Bloco de inicilização
    static {
        System.out.println("Dentro do bloco de inicialização - estatico 1");
        Anime.episodios = new int[100];
        for (int i = 0; i < 100; i++) {
            Anime.episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização - estatico 2");
    }
    static {
        System.out.println("Dentro do bloco de inicialização - estatico 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização - não estatico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int ep : Anime.episodios) {
            System.out.print(ep + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
