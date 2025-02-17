package CriacaoDeMetodos02;

import java.util.Scanner;

public class Ativ05_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ativ05_01Entitie idade = new Ativ05_01Entitie();

        System.out.print("Insira a idade de uma pessoa: ");
        idade.idade = sc.nextInt();

        System.out.println(idade.categoriaIdade());

        sc.close();
    }
}
