package com.erivelton.maratonajava.javacore.Oexception.exception.test;

import com.erivelton.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import com.erivelton.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import com.erivelton.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
