import java.util.*;
public class Araeoftraingle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Side 1");
        double S1 = sc.nextInt();
        System.out.println("enter the Side 2");
        double S2 = sc.nextInt();
        System.out.println("enter the Side 3");
        double S3 = sc.nextInt();
        double S = (S1 + S2 + S3)/2;
        double Area = S*(S-S1)*(S- S2)*(S-S3);
        System.out.println(Math.sqrt(Area));
        sc.close();
    }
}