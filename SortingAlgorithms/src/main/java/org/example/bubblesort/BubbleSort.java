package org.example.bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {23, 12, 15, 6, 4, 24};
        bubbleSort(arr, arr.length);

        for(int element: arr){
            System.out.print(element + " ");
        }

    }

    public static void bubbleSort(int[] arr, int size){
        for(int i = 0; i < size-1; i++){
            for(int j = 0; j < size-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
