package org.example.mergesort;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {12, 3, 13, 17, 11, 10, 1, 5};
        mergeSort(arr);

        for(int element: arr){
            System.out.print(element + " ");
        }
    }

    public static void mergeSort(int[] arr){
        int length = arr.length;

        if(length <= 1){
            return;
        }

        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length-mid];

        for(int i = 0; i < mid; i++){
            left[i] = arr[i];
        }

        for(int i = mid; i < length; i++){
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr){
        int lLength = left.length;
        int rLength = right.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < lLength && j < rLength){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                k++;
                i++;
            } else{
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        while(i < lLength){
            arr[k++] = left[i++];
        }

        while(j < rLength){
            arr[k++] = right[j++];
        }
    }
}
