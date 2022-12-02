package com.erivelton.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        //Formas de declarar um array com valores
        int [] idades1 = new int[3];
        int [] idades2 = {10,15,20};
        int [] idades3 = new int []{100,150,200};

        for (int i = 0; i< idades3.length; i++){
            System.out.println(idades3[i]);
        }

        //Ouro tipo de for

        for (int num:idades2) {
            System.out.println(num);
        }


    }
}
