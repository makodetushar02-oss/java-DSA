package One_Diamentional;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for(int i = 0; i < n; i++) {
            if(!set.contains(arr[i])) set.add(arr[i]);
        }
        System.out.println(set);
        sc.close();
    }
}
