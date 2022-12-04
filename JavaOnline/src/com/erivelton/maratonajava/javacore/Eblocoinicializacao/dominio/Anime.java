package com.erivelton.maratonajava.javacore.Eblocoinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 Alocado espaco em memoria pro objeto
    // 2 Cada atributo de classe é criado e inicializado com valores default ou o que for passada
    // 3 Bloco de inicialização é executado
    // 4 O construtor é executado


    //Bloco de inicilização
    {
        System.out.println("Dentro do bloco de inicialização");
        this.episodios = new int[100];
        for (int i = 0; i < 100; i++) {
            this.episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        System.out.println("Dentro do construtor vazio");
        for (int ep : this.episodios) {
            System.out.print(ep + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
