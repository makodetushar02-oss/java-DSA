package loops.DoWhileloop;

import java.util.Scanner;

public class repeatingProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        do{
            System.out.println("hello world");
            System.out.println("press 1 to repeat");
             n = sc.nextInt();
        }while (n == 1);
    }
}
