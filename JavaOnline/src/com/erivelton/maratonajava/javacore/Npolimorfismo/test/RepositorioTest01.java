package com.erivelton.maratonajava.javacore.Npolimorfismo.test;

import com.erivelton.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import com.erivelton.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import com.erivelton.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import com.erivelton.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {

    public static void main(String[] args) {


    Repositorio repositorio = new RepositorioBancoDeDados();
    //Repositorio repositorio = new RepositorioArquivo();
    //Repositorio repositorio = new RepositorioMemoria();
    repositorio.salvar();

    }
}
