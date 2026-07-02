package loops.whileloop;

import java.util.Scanner;

public class FibonachhiSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1 ;
        int n = sc.nextInt();
        System.out.print(a + " " + b +" " );
        for(int i =3; i<= n ; i++){
            int next = a+b ;
            a= b;
            b =next;
            System.out.print(next + " ");
        }

    }
}
