package com.erivelton.maratonajava.javacore.Hheranca.test;

import com.erivelton.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {

    public static void main(String[] args) {

        // 0 Bloco de inicialização estático da super classe é executado quando a JVM carregar classe
        // 1 Bloco de inicialização estático da sub classe é executado quando a JVM carregar classe filha
        // 2 Alocado espaco em memoria pro objeto da super classe
        // 3 Cada atributo de super classe é criado e inicializado com valores default ou o que for passado
        // 4 Bloco de inicialização da super classe é executado na ordem em que aparece
        // 5 O construtor da super classe é executado
        // 6 Alocado espaco em memoria pro objeto da sub classe
        // 7 Cada atributo de sub classe é criado e inicializado com valores default ou o que for passado
        // 8 Bloco de inicialização da sub classe é executado na ordem em que aparece
        // 9 O construtor da sub classe é executado



        Funcionario funcionario = new Funcionario("Elisson");



    }
}