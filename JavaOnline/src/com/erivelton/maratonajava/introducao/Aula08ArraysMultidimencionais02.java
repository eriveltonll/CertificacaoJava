package com.erivelton.maratonajava.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        int[] array = {1, 2, 3};

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1,2,3,4,5};

        //Outro exemplo de declarar array
        int [][] arrayInt2 = {{1,2},{3,4,5},{6,7,8,9}};


        for (int[] arrBase : arrayInt) {
            System.out.println("\n------------");
            for (int num : arrBase) {
                System.out.print(num + " ");
            }
        }

        for (int[] arrBase : arrayInt2) {
            System.out.println("\n------------");
            for (int num : arrBase) {
                System.out.print(num + " ");
            }
        }
    }
}
