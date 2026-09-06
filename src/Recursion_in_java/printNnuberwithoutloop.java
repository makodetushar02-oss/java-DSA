package Recursion_in_java;
import java.util.Scanner;

public class printNnuberwithoutloop {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNto1(n);
        printNto2(n);
    }
    public static void printNto1(int n){
        // base case
        if(n==0){
            return;
        }
        // logic
        System.out.println(n);
        // recursive call
        printNto1(n-1);
    }
    public static void printNto2(int n){
        // base case
        if(n==0){
            return;
        }
        // recursive call
        printNto2(n-1);
        // logic
        System.out.println(n);

    }
}
