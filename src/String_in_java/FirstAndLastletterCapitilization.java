package String_in_java;

import java.util.Scanner;

public class FirstAndLastletterCapitilization {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        String sArr[] = s.split(" ");
        for (int i = 0; i < sArr.length ; i++) {
            String word = sArr[i];
            if (word.length() == 1) {
                s1 += Character.toUpperCase(word.charAt(0)) + " ";
            } else {
                s1 += Character.toUpperCase(word.charAt(0))
                        + word.substring(1, word.length() - 1)
                        + Character.toUpperCase(word.charAt(word.length() - 1))
                        + " ";
            }
        }
        System.out.println(s1);
    }
}
