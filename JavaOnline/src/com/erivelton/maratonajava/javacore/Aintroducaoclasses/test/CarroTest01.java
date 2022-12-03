package com.erivelton.maratonajava.javacore.Aintroducaoclasses.test;

import com.erivelton.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;
import com.erivelton.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "VW";
        carro1.ano = 1969;

        carro2.nome = "Belina";
        carro2.modelo = "GM";
        carro2.ano = 1971;

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

        //Copiando referencia
        carro2 = carro1;

        System.out.println("\nCarro 2 = Carro 1");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
