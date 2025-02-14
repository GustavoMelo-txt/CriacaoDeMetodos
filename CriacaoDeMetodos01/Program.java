package CriacaoDeMetodos01;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProgramEntitie num1 = new ProgramEntitie();

        System.out.println("Enter three numbers:");
        num1.a = sc.nextInt();
        num1.b = sc.nextInt();
        num1.c = sc.nextInt();

        System.out.println("\nThe bigger number is: " + num1.max());

        sc.close();
    }
}