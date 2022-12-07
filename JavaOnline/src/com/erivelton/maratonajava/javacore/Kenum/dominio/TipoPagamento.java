package com.erivelton.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    /**
     * No exemplo está sendo usado um método abstrato, e serve examente para indicar que nesta método não irá fazer nada
     * Somente será feito nos métodos sobrescritos, logo o objetivo dele é somente declaratório
     * @param valor
     * @return
     */
    public abstract double calcularDesconto(double valor);


}