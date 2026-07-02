package Control_Statemnts.Switch;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1 -> {
                System.out.println("Enter Two number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int sum = a + b ;
                System.out.println(sum);
            }
            case 2 -> {
                System.out.println("Enter Two number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int sum = a - b ;
                System.out.println(sum);
            }
            case 3 -> {
                System.out.println("Enter Two number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int sum = a * b ;
                System.out.println(sum);
            }
            case 4 -> {
                System.out.println("Enter Two number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int sum = a / b ;
                System.out.println(sum);
            }
            case 5 -> {
                System.out.println("Enter Two number");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int sum = a % b ;
                System.out.println(sum);
            }
            default -> System.out.println("wrong value entered");
        }
    }
}
