package String;

import java.util.Scanner;

public class upperToLowerOrLowertoUpper {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1= "";
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                s1 += Character.toLowerCase(ch);
            }else{
                s1 += Character.toUpperCase(ch);
            }
        }
        System.out.println(s1);
    }
}
