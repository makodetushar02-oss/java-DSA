package loops.whileloop;

import java.util.Scanner;

public class palindromNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum= 0;
        int m = n ;
        while (n!= 0 ){
            int rem = n %10 ;
            sum = sum*10 + rem;
            n = n/ 10;
        }
        System.out.println(sum == m ? "Palindrom" : "Not A palindrom");
    }
}
