package CriacaoDeMetodos01;

import java.util.Scanner;

public class Ativ02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = mediaAlunos(nota1, nota2);
        System.out.println("\nMedia das 2 notas: " + media);

        sc.close();
    }

    public static double mediaAlunos(double nota1, double nota2) {
        return nota1 + nota2 / 2;
    }
}