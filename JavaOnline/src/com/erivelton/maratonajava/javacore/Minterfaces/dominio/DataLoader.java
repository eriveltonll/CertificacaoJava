package com.erivelton.maratonajava.javacore.Minterfaces.dominio;


/**
 * A interface foi criada para ser um contrato, logo não pode ter FINAL
 * É possível criar um método concreto dentro de uma interface,
 * para isso é preciso usar o default
 * Por padrão todos os atributos deuma interface são constantes
 * public static final são redundantes
 */
public interface DataLoader {

    public static final int MAX_DATA_SIZE = 10;

    /**
     * Não precisa colocar public e abastract, é redundante, pois toda interface é publica e abstrata
     * Métodos abstrados vc não implenta, precisa ter ponto e vírgual (;) no final
     */

    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }

}
