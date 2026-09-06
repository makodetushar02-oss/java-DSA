package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class insearchenSort {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting" +  Arrays.toString(arr));
        for (int i = 1; i < n-1; i++){
            int j = i-1;
            int k = arr[i];
            while (j >= 0 && arr[j] > k){
                arr[j+1] = arr[j--];
                arr[j+1] = k;
            }
        }
        System.out.println("Array after sorting" +  Arrays.toString(arr));
    }
}
