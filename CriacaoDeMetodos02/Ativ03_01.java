package CriacaoDeMetodos02;

import java.util.Scanner;

public class Ativ03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ativ03_01Entitie palavra = new Ativ03_01Entitie();

        System.out.print("Insira uma palavra: ");
        palavra.palavra = sc.nextLine();

        System.out.println(palavra.checagemPalavra());

        sc.close();
    }
}
