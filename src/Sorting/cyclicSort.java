package Sorting;

import java.util.*;

public class cyclicSort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        CycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void CycleSort(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i<n){
            int currentIndex = arr[i]-1;
            if(arr[i]!=arr[currentIndex]){
                Swap(arr , i , currentIndex);
            }
            else i++ ;
        }
    }

    private static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
