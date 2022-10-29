package com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {18,17,3,1,8,4};
        int[] ans = selectionSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[min]){
                    min = j;

                }
                if(i!=min){
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }

        }
        return arr;
    }
}
