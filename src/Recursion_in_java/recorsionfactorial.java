package Recursion_in_java;
import java.util.Scanner;

public class recorsionfactorial {
    public static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
        System.out.println("Factorial of " + n + " is: " + fact(n));
    }
}
