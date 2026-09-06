package bitconversion;

import java.util.Scanner;

public class swapingwithbitManupaletion {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        n = n^m;
        m = m^n;
        n = n^m;
        System.out.println(n);
        System.out.println(m);
    }
}
