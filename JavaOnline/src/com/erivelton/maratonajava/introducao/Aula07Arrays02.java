package com.erivelton.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /**
         * Padrões de referencia para tipos primitivos
         * byte, short, int, long, float e double o valor inicial é 0
         * char '\u0000' é um espaço vazio ' '
         * bollean é false
         * String é null
         */


        String [] nomes = new String[4];


        nomes[0] = "Erivelton";
        nomes[1] = "Everton";
        nomes[2] = "Elisson";

        for (int i = 0; i< nomes.length; i++){
            System.out.println(nomes[i]);
        }



    }
}
