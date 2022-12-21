package sayurif;

// Faça um programa que leia um numero inteiro do usuario e diga se ele é positivo ou negativo

import java.util.Scanner;

public class Ex1_Java {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        if (i > 0) {
            System.out.println("Número positivo!");
        } else if (i < 0) {
            System.out.println("Número negativo!");
        }
    }
}