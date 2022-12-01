public class Operadores {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;


        System.out.println("A soma é: " + (n1+n2));
        System.out.println("A subtração é: " + (n1-n2));
        System.out.println("A divisão é: " + (n1/n2));
        System.out.println("A multiplicação é: " + (n1*n2));


        double d = 10d;
        float f = 20f;
        System.out.println("Antes de converter " +f);
        f = (float) d;
        System.out.println(d);
        System.out.println(f);
        System.out.println("Depois de converter " +f);


        System.out.println("Resto de Divisão Par "+(10%2));
        System.out.println("Resto de Divisão Impar "+(11%2));

        System.out.println("Testando");

        System.out.println();

    }
}
