package CriacaoDeMetodos02;

import java.util.Scanner;
public class Ativ02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ativ02_01Entitie notas = new Ativ02_01Entitie();

        System.out.print("Insira a primeira nota: ");
        notas.nota1 = sc.nextDouble();

        System.out.print("Insira a segunda nota: ");
        notas.nota2 = sc.nextDouble();

        System.out.println("\nMedia das 2 notas: " + notas.mediaAlunos());

        sc.close();
    }
}
