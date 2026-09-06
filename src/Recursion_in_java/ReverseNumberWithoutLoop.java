package Recursion_in_java;
import java.util.Scanner;

public class ReverseNumberWithoutLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
    }
    public static void reverse(int n){
        if (n == 0){
            return;
        }
        System.out.print(n % 10);
        reverse(n / 10);
    }
}
