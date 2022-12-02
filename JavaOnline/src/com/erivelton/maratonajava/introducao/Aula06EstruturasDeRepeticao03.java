package com.erivelton.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {

    public static void main(String[] args) {

        //Imprimir os 25 primeiros numeros de um dado valor

        int valMax = 50;

        for(int i = 0;i<=valMax;i++) {
            if (i>25)
                break;
            System.out.println(i);

        }
    }
}
