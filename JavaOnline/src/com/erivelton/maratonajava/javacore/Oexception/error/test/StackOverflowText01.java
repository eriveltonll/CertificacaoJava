package com.erivelton.maratonajava.javacore.Oexception.error.test;

public class StackOverflowText01 {
    public static void main(String[] args) {
        //recursividade();
    }


    //Exemplo de um método recursivo que daria um stackOverflow
    public static void recursividade(){
        recursividade();
    }
}
