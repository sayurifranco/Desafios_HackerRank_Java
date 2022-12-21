package sayurif.array;

// Declare uma array com 3 números inteiros;
//Após isto, imprima na tela os índices ímpares
//dica: o for pode iterar dentro dos índices da array

public class Ex4_Array {

    public static void main(String[] args) {

        int[] array = {34, 54, 67, 87, 99};

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}
