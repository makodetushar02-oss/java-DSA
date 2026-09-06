package bitconversion;

import java.util.Scanner;

public class leftShift {
    static void main(String[] args) {
//        System.out.println(8<<3);
//        System.out.println(100>>3);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&1) == 0) {
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
        if((n&(n-1)) == 0){
            System.out.println("power of two");
        }else {
            System.out.println("not power of two");
        }
        System.out.println(((n&1) ==0) ? "even" : "odd");
    }
}
