package String_in_java;

import java.util.Scanner;

public class PallindromicString {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       String rev = "" ;
       for (int i = s.length()-1; i >=0; i--) {
           rev += s.charAt(i);
       }
       if(s.equals(rev)){
           System.out.println("Palindromic string");
       }else {
           System.out.println("Not A Palindromic String");
       }
    }
}
