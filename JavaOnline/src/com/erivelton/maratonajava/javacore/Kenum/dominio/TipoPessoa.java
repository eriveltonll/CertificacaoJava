package com.erivelton.maratonajava.javacore.Kenum.dominio;

public enum TipoPessoa {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int valor;
    public final String nomeRelatorio;

    TipoPessoa(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoPessoa tipoPessoaPorNomeRelatorio(String nomeRelatorio){
        for (TipoPessoa tipoPessoa: values()) {
            if (tipoPessoa.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoPessoa;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
