package loops.for_loop;

import java.util.Scanner;

public class primeFactorofNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            if (n == 0 || n == 1) {
                System.out.println("No prime factors");
                return "";
            }
            for(int i = 2 ; i<= n ; i++){
                while(n % i == 0){
                    System.out.print(i + " ");
                    n = n/i ;
                }
            }

            return "";
        }
    }
}
