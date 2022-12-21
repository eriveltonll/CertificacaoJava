package com.erivelton.maratonajava.javacore.Oexception.exception.test;

import com.erivelton.maratonajava.javacore.Oexception.exception.dominio.Leitor1;
import com.erivelton.maratonajava.javacore.Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {

    public static void main(String[] args) {
        lerArquivo();
    }

    /**
     * Como deve ser feito usando try com recursos
     */

    public static void lerArquivo() {


        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Exemplo de como tratar o método feito do lerArquivo2
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {
            //Trecho de código
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * Exemplo de um método feio, nunca use
     */
    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
