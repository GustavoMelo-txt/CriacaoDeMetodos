package CriacaoDeMetodos01;

import java.util.Scanner;

public class Ativ05_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a idade de uma pessoa: ");
        int idade = sc.nextInt();

        String resultado = categoriaIdade(idade);
        System.out.println(resultado);

        sc.close();
    }

    public static String categoriaIdade (int idade) {
        String resultado;

        if (idade <= 12 && idade > 0) {
            resultado = "\nEssa pessoa é uma criança.";
        } else if (idade > 12 && idade <= 17) {
            resultado = "\nEssa pessoa é um adolescente";
        } else if (idade > 17 && idade <= 64) {
            resultado = "\nEssa pessoa é um adulto";
        } else if (idade > 64){
            resultado = "\nEssa pessoa é um idoso";
        } else {
            resultado = "\nEssa idade não existe";
        }

        return resultado;
    }
}
