package CriacaoDeMetodos01;

import java.util.Scanner;

public class Ativ04_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Insira o segundo numero: ");
        int numero2 = sc.nextInt();

        int soma = checagem(numero1, numero2);
        System.out.print("\n" + numero1 + " + " + numero2 + " = " + soma);

        sc.close();
    }

    public static int checagem (int numero1, int numero2) {
        int soma;

        return soma = numero1 + numero2;
    }
}