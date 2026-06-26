import java.util.*;
public class weakdays {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Day 1 - 7");
        int A = sc.nextInt();
        if(A == 1){
            System.out.println("the day is Monday");
        }else if(A == 2){
            System.out.println("the day is Tuesday");
        }else if(A == 3){
            System.out.println("the day is Wednesday");
        }else if(A == 4){
            System.out.println("the day is Thursday");
        }else if(A == 5){
            System.out.println("the day is Friday");
        }else if(A == 6){
            System.out.println("the day is Saturday");
        }else if(A == 7){
            System.out.println("the day is Sunday");
        }else{
            System.out.println("wrong value Entered");
        }
        sc.close();
    }
}