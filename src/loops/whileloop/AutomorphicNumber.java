package loops.whileloop;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whoes all digit will be you want to sum");
        int n = sc.nextInt();
        int tamp = n;
        int sum = 0;
        while (n != 0) {
            sum++;
            n = n / 10;
        }
         n = tamp ;
        long sqr = n*n;
        long lastdigit = sqr % (long)Math.pow(10 , sum);
        System.out.println(lastdigit == n ? "Automorphic number" : "Not an otomorphic Nuber" );
    }
}
