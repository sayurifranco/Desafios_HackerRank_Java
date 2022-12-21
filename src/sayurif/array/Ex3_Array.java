package sayurif.array;

// Declare uma array com 3 números inteiros;
//Após isto, imprima na tela a array completa na ordem inversa
//dica: o for pode iterar dentro dos índices da array

public class Ex3_Array {

    public static void main(String[] args) {

        int[] array = {34, 54, 67};

        for (int i = 2; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
    }
}
