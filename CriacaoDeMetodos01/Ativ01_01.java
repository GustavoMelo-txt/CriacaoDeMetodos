package CriacaoDeMetodos01;

import java.util.Scanner;

public class Ativ01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = sc.nextInt();

        String resposta = verificacao(numero);
        System.out.println("\n" + resposta);

        sc.close();
    }

    public static String verificacao (int numero) {
        String resposta;

        if (numero > 0) {
            resposta = "O numero " + numero + " é positivo";
        } else {
            resposta = "O numero " + numero + " é negativo";
        }

        return resposta;
    }
}
