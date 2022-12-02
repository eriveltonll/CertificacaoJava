package com.erivelton.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {

    public static void main(String[] args) {
        //while, do while, for

        System.out.println("Usando o While");
        int count = 0;
        while (count <10){
            System.out.println(++count);

        }

        System.out.println("Usando o do-While");
        count = 0;
        do{
            System.out.println(++count);
        }while (count<10);

        System.out.println("Usando o For");
        for(int i = 1;i<=10;i++){
            System.out.println(i);

        }
    }
}
