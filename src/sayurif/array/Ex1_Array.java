package sayurif.array;

// Ler 3 números inteiros, armazenando os números em uma array

import java.util.Arrays;
import java.util.Scanner;

public class Ex1_Array {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();
        int[] array = {i1,i2,i3};

        System.out.println(Arrays.toString(array));

    }
}
