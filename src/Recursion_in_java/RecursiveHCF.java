package Recursion_in_java;
import java.util.Scanner;

public class RecursiveHCF {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("HCF of " + a + " and " + b + " is: " + hcf(a, b));
            System.out.println("HCF of " + a + " and " + b + " is: " + Euclidean(a, b));
        }
    // EUCIDEAN ALGORITHM
        public static int hcf(int a, int b) {
            // EUCIDEAN ALGORITHM (division method )
            if (b == 0) {
                return a;
            }
            return hcf(b, a % b);
        }
    public static int Euclidean(int a, int b) {
        // EUCIDEAN ALGORITHM (Subtraction method )
            if (b == a) {
                return a;
            }
            if(a>b){
                return Euclidean(a-b, b);
            } else if (b>a) {
                return  Euclidean(a, b-a);
            }
            return Euclidean(a, b);
    }
    }

