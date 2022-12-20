package com.erivelton.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {

        /**
         * Execeções mais genéricas sempre tem que ficar depois das mais específicas
         * em razão do polimorfismo
        */
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e ) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (ArithmeticException e ) {
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e ) {
            System.out.println("Dentro do RuntimeException");
        }

        /**
         * Outas formas de declarar catch 
         */

        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
                throw new RuntimeException(e);
        }

    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException, IOException{

    }
}

