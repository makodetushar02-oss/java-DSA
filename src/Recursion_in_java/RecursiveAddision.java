package Recursion_in_java;
import java.util.Scanner;

public class RecursiveAddision {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Add(n);
        System.out.println("sum of " + n + " is: " + Add(n));
    }
    public static int Add(int n){
        if(n==1){
            return 1;
        }
        return n+Add(n-1);
    }
}
