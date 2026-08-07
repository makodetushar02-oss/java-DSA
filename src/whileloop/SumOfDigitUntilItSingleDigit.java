package loops.whileloop;

import java.util.Scanner;

public class SumOfDigitUntilItSingleDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whoes all digit will be you want to sum");
        int n = sc.nextInt();
        while (n >=9 ){
            int sum = 0 ;
            while (n != 0) {
                int rem = n % 10;
                sum += rem;
                n = n / 10;
            }
            n = sum ;
        }
        System.out.println(n);
    }
}
