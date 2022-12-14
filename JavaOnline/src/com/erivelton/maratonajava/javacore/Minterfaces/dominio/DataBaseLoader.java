package com.erivelton.maratonajava.javacore.Minterfaces.dominio;


/**
 * Como a interface é abstrata é preciso sobrescrever o método, logo tem o @override
 * o implements pode ser para mais de uma interface, como vemos no exemplo abaixo
 * esta implmentando duas interfaces
 *
 */
public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados");

    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do Banco de Dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }


    //Método static não irá ter sobrescrita
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}
