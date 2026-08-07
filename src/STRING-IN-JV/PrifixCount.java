package String;

import java.util.Scanner;

public class PrifixCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        System.out.print("Enter prefix that you want to find: ");
        String prefix = sc.next();
        int count = 0;
        for (String temp : str) {
            if (temp.startsWith(prefix)) {
                count++;
            }
        }
        System.out.println("Count = " + count);
        sc.close();
    }
}