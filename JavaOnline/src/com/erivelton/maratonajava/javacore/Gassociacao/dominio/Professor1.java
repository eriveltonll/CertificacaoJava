package com.erivelton.maratonajava.javacore.Gassociacao.dominio;

public class Professor1 {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    public Professor1(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor1(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("----------------");
        System.out.println("Professor: " + this.nome);
        if (this.seminarios == null || this.seminarios.length==0) return;
        System.out.println("\n----Seminários disponíveis----");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println("Local:" + seminario.getLocal().getEndereco());
            if (seminario.getEstudante() == null || seminario.getEstudante().length==0) continue;
            System.out.println("---Alunos---");
            for (Estudante estudante : seminario.getEstudante()) {
                System.out.println("\n       Aluno:" + estudante.getNome() + "\n      Idade: " + estudante.getIdade());
            }
            System.out.println();
        }
    }


    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
