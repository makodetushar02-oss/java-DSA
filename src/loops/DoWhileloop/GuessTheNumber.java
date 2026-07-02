package loops.DoWhileloop;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int guess = (int)((Math.random() * 100) + 1);
        System.out.println("guess the number B/W 1 - 100");
        int n ;
        int maxguess = 10 ;
        System.out.println("you have only 10 chance to win");
        do {
            n = sc.nextInt();
            if( n == guess){
                System.out.println("Congratulation You won ");
            }  if (--maxguess == 0) {
                System.out.println("you loss the game");
                break;
            }
             if (n > guess) {
                System.out.println("think smaller");
            }else{
                System.out.println("think greater");
            }
            System.out.println("Left Attempt : " + maxguess);
        } while (true);

    }
}
