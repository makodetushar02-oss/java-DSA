package Recursion_in_java;
import java.util.Scanner;

public class CountOfDigitWithoutLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(digit(n));
    }
    public static  int digit(int n){
        if (n == 0){
            return 0;
        }
        return 1 + digit(n / 10);
    }
}
