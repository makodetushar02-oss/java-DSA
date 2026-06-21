import java.util.*;

public class CI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Principle amount ");
        int P = sc.nextInt();
        System.out.println("enter the annual intrest Rate");
        double R = sc.nextDouble();
        System.out.println("enter the duration ");
        int T = sc.nextInt();
        System.out.println("enter the intrest Cycle in a year");
        int N = sc.nextInt();
        double A = 1 + R/N;
        int B = N * T ;
        System.out.println(P*Math.pow(A, B));
        sc.close();
    }
}