package sayurif.whileforswitch;

// Faça um programa que leia um numero inteiro do usuario e diga se ele é impar ou par

import java.util.Scanner;

public class Ex2_Java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        if (i % 2 == 0) {
            System.out.println("Par!");
        } else {
            System.out.println("Ímpar!");
        }
    }
}
