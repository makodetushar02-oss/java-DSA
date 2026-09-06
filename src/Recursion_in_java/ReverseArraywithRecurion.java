package Recursion_in_java;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArraywithRecurion {
    public static void reverseArray(int[] arr,int i,int j){
        if(i>=j) return;
        int a = arr[i];
        int b = arr[j];
        reverseArray(arr, i+1, j-1);
        arr[i] = b;
        arr[j] = a;

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       reverseArray(arr, 0, n-1);
        System.out.println("The reversed array is: " + Arrays.toString(arr));
    }
}
