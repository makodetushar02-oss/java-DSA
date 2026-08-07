
import java.util.*;

public class fi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0 ;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (target == sum){
                     count++ ;
                }
            }

        }
        System.out.println(count);
        sc.close();
    }
}