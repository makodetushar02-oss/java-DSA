package loops.whileloop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DigitsSepration {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nuber which do you want to seprate");
        int n = sc.nextInt();
        while(n != 0){
            int rem = n% 10;
            System.out.print(rem + " ");
            n = n / 10;
        }
    }
}
