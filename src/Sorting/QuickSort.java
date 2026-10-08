package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end ) {
        if (start > end) return;
        int pivotIndex = pivot(arr,start,end);
        quickSort(arr , start , pivotIndex-1 );
        quickSort(arr , pivotIndex + 1, end);
    }

    private static int pivot(int[] arr, int start, int end) {
        int pivot = arr[end];
        int j = start-1;
        for (int i = start; i <= end; i++) {
            if (arr[i] < pivot) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        j++;
        int temp = arr[j];
         arr[j] =arr[end];
        arr[end] = temp;
        return j;
    }

}
