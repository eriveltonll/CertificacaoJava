package com.erivelton.maratonajava.javacore.Minterfaces.dominio;


/**
 * Como a interface é abstrata é preciso sobrescrever o método, logo tem o @override
 */
public class DataBaseLoader implements DataLoader {

    @Override
    public void load() {
        System.out.println("Carregando dados do Bando de Dados");

    }
}
