package CriacaoDeMetodos02;

import java.util.Scanner;

public class Ativ04_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ativ04_01Entitie numero = new Ativ04_01Entitie();

        System.out.print("Insira o primeiro numero: ");
        numero.num1 = sc.nextInt();

        System.out.print("Insira o segundo numero: ");
        numero.num2 = sc.nextInt();

        System.out.print("\n" + numero.num1 + " + " + numero.num2 + " = " + numero.checagem());

        sc.close();
    }
}
