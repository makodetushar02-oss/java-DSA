package Recursion_in_java;
import java.util.Scanner;

public class Recursionbefor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        // base case
        if(n==0){
            return;
        }
        // logic
        System.out.println("Hello");
        // recursive call
        print(n-1);
    }
}
