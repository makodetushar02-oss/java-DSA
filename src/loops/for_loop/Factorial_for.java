package loops.for_loop;

import java.util.Scanner;

public class Factorial_for {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the until which you have to find Factorial_for");
        int A = sc.nextInt();
        int sum = 1;
        for(int i =1 ; i<= A; i++){
            sum  *= i;
        }
        System.out.println(sum);
    }
}
