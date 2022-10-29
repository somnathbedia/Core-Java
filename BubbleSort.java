package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23,12,10,26,23,4};

        int[] ans = bubbleSort(arr);
        System.out.println(Arrays.toString(ans));

    }

    static int[] bubbleSort(int[] arr){
        for (int i = arr.length; i >0 ; i--) {
            for (int j = 0; j < i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        return arr;
    }



}
