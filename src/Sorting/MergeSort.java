package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        divid(arr , 0 , arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
//    Step 1 -
    private static void divid(int[] arr, int start, int end) {
//        mid
        if (start >= end) return;
        int mid = start +(end - start)/2;
//        merge
        divid(arr , start, mid);
        divid(arr , mid + 1 , end);
//        conquer
        conquer(arr , start , mid,end);
    }
    private static void conquer(int[] arr, int s, int mid, int e) {
        int[] merge = new int[e-s+1];
        int i = s, j = mid+1, k = 0;

        while (i <= mid && j <= e){
            if (arr[i] <= arr[j])
                merge[k++] = arr[i++];
            else
                merge[k++] = arr[j++];
        }
        while (i <= mid){
            merge[k++] = arr[i++];
        }
        while (j <= e){
            merge[k++] = arr[j++];
        }

        for (int l = 0; l < merge.length; l++) {
            arr[l+s] = merge[l];
        }

    }
}
