package Searching_Algo;

import java.util.Scanner;

public class Binary_search {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[]  arr = new int[n];
        System.out.println("Enter the elements of Sorted the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();
        int ans = BinSearch(arr,target);
        System.out.println(ans);
    }

    private static int BinSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            }else if (arr[mid] < target) {
                low = mid + 1;
            }else  {
                high = mid - 1;
            }
        }
        return -1;
    }
}
