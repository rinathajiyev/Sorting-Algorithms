package org.example.selectionsort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {12, 3, 7, 13, 1};
        selectionSort(arr, arr.length);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr, int size){
        for(int i = 0; i < size-1; i++){
            int min = i;

            for(int j = i+1; j < size; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
