package com.erivelton.maratonajava.introducao;

public class Aula03ImprimindoVariaveis {


    public static void main(String[] args) {

        int idade = 38;
        double salarioDouble = 3000.0D;
        float salarioFloat = 3000.0F;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdade = true;
        boolean falso = false;
        long numeroGrande = 1000L;

        /**
         * O tipo char são de dois bytes, pode ser usado como um caracter com ''
         * Poderá ser usado informando um valor inteiro que ele irá converter de acordo com a tabela ASCII
         * Pode ser usado como o tipo hexadecimal usando \u0060 da tabela Unicode
         */

        char caractere = 'A';   //2 bytes, se colocar um valor inteiro ele converte pra tabela Unicode

        String nome = "Erivelton";

        System.out.println(nome + " de idade " + idade);
        System.out.println("salarioDouble " + salarioDouble);
        System.out.println("salarioFloat " + salarioFloat);
        System.out.println("idadeByte " + idadeByte);
        System.out.println("idadeShort " + idadeShort);
        System.out.println("verdade " + verdade);
        System.out.println("falso " + falso);
        System.out.println("numeroGrande " + numeroGrande);
        System.out.println("caractere " + caractere);
    }
}
