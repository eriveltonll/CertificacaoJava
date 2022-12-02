package com.erivelton.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {

    public static void main(String[] args) {

        //Dados os valores de 1 a 7, imprimia se é dia ultl ou final de semana
        //Use switch

        byte dia = 1;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

    }
}
