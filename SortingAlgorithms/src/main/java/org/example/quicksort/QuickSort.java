package org.example.quicksort;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 13, 6, 16, 8, 12, 7};
        quickSort(arr, 0, arr.length-1);

        for(int element: arr){
            System.out.print(element + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start < end){
            int pIndex = partition(arr, start, end);

            quickSort(arr, start, pIndex-1);
            quickSort(arr, pIndex+1, end);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int pIndex = start;

        for(int i = start; i < end; i++){
            if(arr[i] <= pivot){
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp;
                pIndex++;

            }
        }

        int temp = arr[pIndex];
        arr[pIndex] = arr[end];
        arr[end] = temp;

        return pIndex;
    }
}
