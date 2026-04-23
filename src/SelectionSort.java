

import java.util.Arrays;

class SelectionSort {

    static void selectionSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
          
            int posicao_menor = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[posicao_menor]) {
 
                    posicao_menor = j;
                }
            }
            int temp = array[i];
            array[i] = array[posicao_menor];
            array[posicao_menor] = temp;           
        }
    }

    static void printArray(int[] array){
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }


public static void main(String[] args){
        int[] array = { 79, 12, 1, 55, 23 };

        System.out.print("Desordenado: ");
        printArray(array);

        selectionSort(array);

        System.out.print("Ordenado: ");
        printArray(array);
    }
}

