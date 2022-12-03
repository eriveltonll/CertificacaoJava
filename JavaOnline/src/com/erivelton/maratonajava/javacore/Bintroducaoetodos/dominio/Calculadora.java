package com.erivelton.maratonajava.javacore.Bintroducaoetodos.dominio;

public class Calculadora {


    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 7);
    }

    public void multiplicaDoisNumeros(int n1, int n2) {
        System.out.println(n1 * n2);
    }

    public double dividiDoisNumeros(double n1, double n2) {

        if (n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }

    //Usando return em void
    public void imprimeDivisaoDeDoisNumeros(double n1, double n2) {

        if (n2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
            System.out.println(n1/n2);
    }

    public void alteraDoisNumeros(int n1, int n2){
        n1 = 99;
        n2=33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+ n1);
        System.out.println("Num2 "+ n2);
    }



    //Modelo 1 de criação de metodo com array por parametro
    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros) {
            soma+=num;
        }
        System.out.println(soma);
    }

    //Modelo 2 de criação de metodo com array por parametro
    //Só pode ser usado como ultimo valor na referencia, quando declarado na assinatura
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros) {
            soma+=num;
        }
        System.out.println(soma);
    }

}
