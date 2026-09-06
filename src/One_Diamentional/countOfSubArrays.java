package One_Diamentional;

import java.util.Arrays;
import java.util.Scanner;

public class countOfSubArrays {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) arr[i] = in.nextInt();
        System.out.println("Enter the target sum");
        int target = in.nextInt();
        int ans = 0;
        System.out.println("Given array" +  Arrays.toString(arr));
        for (int i = 0; i < n ; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if(sum == target)
                    ans++;
            }
        }
        System.out.println("the total subArray present int array of sum "+ target + " is " +ans);
    }
}
