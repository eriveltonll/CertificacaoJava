public class ImprimindoVariaveis {


    public static void main(String[] args) {

        int idade = 38;
        double salarioDouble = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdade = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caractere = 'A';   //2 bytes, se colocar um valor inteiro ele converte pra tabela Unicode
        String nome = "Erivelton";

        System.out.println(nome + " de idade " + idade);
    }
}
