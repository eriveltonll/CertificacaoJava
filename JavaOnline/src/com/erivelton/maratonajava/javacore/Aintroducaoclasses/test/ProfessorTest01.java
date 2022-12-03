package com.erivelton.maratonajava.javacore.Aintroducaoclasses.test;

import com.erivelton.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Mestre Erivelton";
        professor.idade = 38;
        professor.sexo = 'M';

        System.out.println(professor.nome + " "+ professor.idade +" "+ professor.sexo);


    }
}
