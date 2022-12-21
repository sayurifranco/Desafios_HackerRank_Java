package sayurif;

// Faça um programa em que exibe na tela um cardapio de hamburgeres:
// A saída deverá ser assim:
// 1 - x-burger
// 2 - x-salada
// 3 - x-bacon

// Ainda no programa anterior, adicione a funcionalidade de que o usuário
// pode escolher um dos hamburgueres pelo número, digitando pelo teclado apos o menu ser exibido.
//
//Você deve usar switch neste programa
//
//Dependendo da escolha, o programa deverá exibir na tela:
//
//<NOME_HAMBURGUER> está sendo preparado
//
//Por exemplo:
//
//Entrada:
//1
//
//Saída:
//x-burger está sendo preparado

import java.util.Scanner;

public class Ex5_Java {
    public static void main(String[] args) {
        System.out.println("1 - x-burger");
        System.out.println("2 - x-salada");
        System.out.println("3 - x-bacon");

        Scanner scan = new Scanner(System.in);
        int hamburguer = scan.nextInt();

        switch (hamburguer) {
            case 1:
                System.out.println("x-burger está sendo preparado");
                break;
            case 2:
                System.out.println("x-salada está sendo preparado");
                break;
            case 3:
                System.out.println("x-bacon está sendo preparado");
                break;
            default:
                System.out.println("Opção inválida! Escolha entre 1, 2 e 3");
        }
    }
}