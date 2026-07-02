package Control_Statemnts.Switch;

import java.util.Scanner;

public class vowelOrcosunent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char A = Character.toLowerCase(sc.nextLine().charAt(0));
        switch (A){
            case 'a','e','o','u','i' -> System.out.println("Vowel");
            case 'y','w' -> System.out.println("semivowel");
            default -> System.out.println("Consonant");
        }
    }
}
