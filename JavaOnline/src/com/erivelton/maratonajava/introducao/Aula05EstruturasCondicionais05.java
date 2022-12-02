package com.erivelton.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {

    public static void main(String[] args) {

        //Imprima o dia da semana, considerando o domingo como 1

        byte dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Dia Inválido");
                break;
        }

        char sexo = 'M';

        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Outro");
                break;
        }

    }
}
