package sayurif.array;

// Dada a array numeros, faça um programa que imprima na tela qual o índice do número 99 da array
// Dicas: podemos iterar na array utilizando for
// Utilize o laço for para comparar os valores da array que você deseja

public class Ex5_Array {

    public static void main(String[] args) {

        int[] array = {5, 10, 77, 99, 201};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 99) {
                System.out.println(i);
            }
        }
    }
}
