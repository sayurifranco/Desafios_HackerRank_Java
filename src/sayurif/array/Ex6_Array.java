package sayurif.array;

// Preencher uma array de 1 a 100

import java.util.Scanner;

public class Ex6_Array {

    public static void main(String[] args) {

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i]=i+1;
            System.out.println(array[i]);
        }
    }
}