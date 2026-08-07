

import java.util.Scanner;

public class SecondMethodupperToLowerOrLowertoUpper {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'A' && 'Z' >= ch) {
                s1 += (char)(ch + 32);
            }else{
                s1 += (char)(ch - 32);
            }
        }
        System.out.println(s1);
    }
}


