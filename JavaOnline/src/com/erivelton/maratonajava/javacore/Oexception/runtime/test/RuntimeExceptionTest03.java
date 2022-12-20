package com.erivelton.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

        abreConexao2();

    }
    /**
     * O finally tem a função de executar algo mesmo passando em try ou catch
     */
    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            // throw new RuntimeException();
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recuso e liberando pelo SO");
        }
        return null;
    }

    /**
     * O comando finally também pode ser usado somente com um try, sem o uso do catch
     */

    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        }finally {
            System.out.println("Fechando recuso e liberando pelo SO");
        }
    }
}
