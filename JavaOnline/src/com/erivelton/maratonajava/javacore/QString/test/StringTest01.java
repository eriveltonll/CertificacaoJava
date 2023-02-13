package com.erivelton.maratonajava.javacore.QString.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Erivelton"; //String constant pool
        String nome2 = "Erivelton";
        nome = nome.concat(" Laia");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String ("Erivelton"); //1 variável de referência, 2 obj do tipo string, 3 uma string no pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

    }
}
