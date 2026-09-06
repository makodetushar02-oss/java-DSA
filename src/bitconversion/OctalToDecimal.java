package bitconversion;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        int n = s.length();
        int i = 0;
        while (i < n) {
            sum += Math.pow(8, n - i - 1) * (s.charAt(i) - '0');
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
