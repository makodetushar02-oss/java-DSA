package String;

import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();
        if (s.length() != s1.length()) {
            System.out.println("Not An Anagram");
            return;
        }
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            arr[ch - 'a']--;
        }
        boolean isAnagram = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram ? "Anagram" : "Not An Anagram");
    }
}