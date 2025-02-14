package CriacaoDeMetodos01;

import java.util.Scanner;

public class Ativ03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        String palavra = sc.nextLine();

        String resultado = checagemPalavra(palavra);
        System.out.println(resultado);

        sc.close();
    }

    public static String checagemPalavra(String palavra) {
        String resultado;

        if (palavra.equals("sim")) {
            resultado = "\nO usuario digitou \"sim\".";
        } else if (palavra.equals("Sim")){
            resultado = "\nO usuario digitou \"Sim\".";
        } else if (palavra.equals("Nao")) {
            resultado = "\nO usuario digitou \"Nao\".";
        } else if (palavra.equals("nao")) {
            resultado = "\nO usuario digitou \"nao\".";
        } else {
            resultado = "\nO usuario não digitou \"Sim\" ou \"Nao\".";
        }

        return resultado;
    }
}
