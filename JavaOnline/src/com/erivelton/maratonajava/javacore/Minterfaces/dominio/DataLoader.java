package com.erivelton.maratonajava.javacore.Minterfaces.dominio;


/**
 * A interface foi criada para ser um contrato, logo não pode ter FINAL
 */
public interface DataLoader {
    /**
     * Não precisa colocar public e abastract, é redundante, pois toda interface é publica e abstrata
     * Métodos abstrados vc não implenta, precisa ter ponto e vírgual (;) no final
     */

    public abstract void load();

}
