package sayurif;

// Ler o nome de 2 times e o número de gols marcados na partida. Escrever o nome do vencedor.
// Caso não haja vencedor deverá ser impressa a palavra EMPATE.

import java.util.Scanner;

public class Ex6_Java {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        String time1 = time.nextLine();
        String time2 = time.nextLine();

        Scanner gol = new Scanner(System.in);
        int i = gol.nextInt();
        int j = gol.nextInt();

        if (i < j) {
            System.out.println("O time vencedor é: " + time2);
        } else if (i > j) {
            System.out.println("O time vencedor é: " + time1);
        } else {
            System.out.println("EMPATE");
        }
    }
}
