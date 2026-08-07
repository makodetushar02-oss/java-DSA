package loops.whileloop;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int finalsum = 0 ;
        int m = n ;
        while (n!= 0 ){
            int rem = n %10 ;
            int sum= 1;
           for(int i = 1 ; i <= rem; i++ ){
               sum = sum * i;
           }
           finalsum += sum;
           n = n/ 10 ;
        }
        System.out.println(finalsum == m ? "Strong Number" : "Not A Strong number");
    }
}
