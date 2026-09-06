package Recursion_in_java;
import java.util.Arrays;
import java.util.Scanner;

public class palindromicStringRecursive {
        public static boolean reverseString(String s, int i, int j) {
            if(i>=j) return true;
            if(s.charAt(i) !=s.charAt(j)) return false;
            return reverseString(s, i+1, j-1);

        }
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(reverseString(s, 0,s.length()-1));
        }
    }

