

import java.util.Scanner;

public class charCompairMethod {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
//        normal compare
        System.out.println(s.equals(s1));
//        Ignore capital small letters (ignore case)
        System.out.println(s.equalsIgnoreCase(s1));
//         compare to methode it compares lexicographic order
        System.out.println(s.compareTo(s1));
    }
}
