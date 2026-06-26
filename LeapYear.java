import java.util.*;
public class LeapYear {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Year to be check leap year or not");
        int N = sc.nextInt();
        if(N%400 == 0 ){
            System.out.println(" leap year");
        }
        else if(N%4 != 0 || N%100 == 0){
            System.out.println("not a leap year");
        }else {
            System.out.println(" leap year");
        }
        sc.close();
    }
}