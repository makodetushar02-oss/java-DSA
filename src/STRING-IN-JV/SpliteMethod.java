package String;

import java.util.Scanner;

public class SpliteMethod {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String S[] = s.split(" ");
        for(String temp : S){
             temp = Character.toUpperCase(temp.charAt(0))
                    + temp.substring(1, temp.length() - 1) +
                     Character.toUpperCase(temp.charAt(temp.length()-1));
            System.out.println(temp);
        }
        sc.close();
    }
}
