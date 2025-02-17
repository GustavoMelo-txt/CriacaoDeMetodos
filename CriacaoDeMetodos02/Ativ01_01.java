package CriacaoDeMetodos02;

import java.util.Scanner;

public class Ativ01_01 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Ativ01_01Entitie numero = new Ativ01_01Entitie();

            System.out.print("Insira um número: ");
            numero.numero = sc.nextInt();


            System.out.println("\n" + numero.verificacao());

            sc.close();
    }
}
