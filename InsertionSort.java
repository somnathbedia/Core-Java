package com.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {34,8,7,5,3};
        int[] ans = insertionSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] insertionSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int cur = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > cur){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=cur;
        }
        return arr;
    }
}
