package Recursion_in_java;
import java.util.Scanner;

public class RecursiveFibonacchi {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    public static int  fibonacci(int n) {
        // base case
        if (n == 1 ||  n == 2) return n-1;
//        fibonacci(n-1);
        // recurive call
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
