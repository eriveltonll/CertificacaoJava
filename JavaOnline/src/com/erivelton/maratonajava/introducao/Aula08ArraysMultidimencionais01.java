package com.erivelton.maratonajava.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void main(String[] args) {

        int[][] dias = new int[3][3];

        dias[0][0] = 15;
        dias[0][1] = 21;
        dias[0][2] = 32;

        dias[1][0] = 17;
        dias[1][1] = 22;
        dias[1][2] = 30;

        dias[2][0] = 19;
        dias[2][1] = 29;
        dias[2][2] = 39;

        System.out.println("===Usando o for =====");
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("===Usando o for Each=====");
        for (int[] arrBase : dias) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }
}
