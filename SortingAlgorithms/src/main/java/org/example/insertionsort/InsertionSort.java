package org.example.insertionsort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr, arr.length);

        for(int element: arr){
            System.out.print(element + " ");
        }
    }

    public static void insertionSort(int[] arr, int size){
        for(int i = 1; i < size; i++){
            int value = arr[i];
            int hole = i;

            while(hole > 0 && arr[hole-1] > value){
                arr[hole] = arr[hole-1];
                hole--;
            }

            arr[hole] = value;
        }
    }
}
