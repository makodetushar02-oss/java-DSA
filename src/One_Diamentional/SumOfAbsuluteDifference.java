
import java.util.Scanner;

public class SumOfAbsuluteDifference {
    public static long sumOfAbsDifferences(int[] arr) {
        int n = arr.length;
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += (long) arr[i] * (2 * i - n + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("result : " + sumOfAbsDifferences(arr));
        sc.close();
    }
}

