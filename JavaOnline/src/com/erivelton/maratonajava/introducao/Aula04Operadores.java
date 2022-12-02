package com.erivelton.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;

        // + - / *
        System.out.println("A soma é: " + (n1+n2));
        System.out.println("A subtração é: " + (n1-n2));
        System.out.println("A divisão é: " + (n1/n2));
        System.out.println("A multiplicação é: " + (n1*n2));


        // Uso de cast
        double d = 10d;
        float f = 20f;
        System.out.println("Antes de converter " +f);
        f = (float) d;
        System.out.println(d);
        System.out.println(f);
        System.out.println("Depois de converter " +f);


        //%
        System.out.println("Resto de Divisão Par "+(10%2));
        System.out.println("Resto de Divisão Impar "+(11%2));

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10==20;
        boolean isDezDiferenteVinte = 10!=20;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);

        // && || !

        int idade = 35;
        float salario = 3500F;
        boolean dentroDaLei = idade> 30 && salario >4612;
        boolean dentroDaLei2 = idade> 30 || salario >4612;

        System.out.println("dentroDaLei " + dentroDaLei);
        System.out.println("dentroDaLei2 " + dentroDaLei2);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println("Bonus += "+ bonus);
        bonus -= 500;
        System.out.println("Bonus -= "+ bonus);
        bonus *= 30;
        System.out.println("Bonus *= "+ bonus);
        bonus /= 2;
        System.out.println("Bonus /= "+ bonus);
        bonus %= 2;
        System.out.println("Bonus %= "+ bonus);

        // ++ --
        int contador = 0;
        contador ++;
        System.out.println("Contador++ " + contador);
        contador --;
        System.out.println("Contador-- " + contador);

    }
}
