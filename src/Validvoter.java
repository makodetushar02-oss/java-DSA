import java.util.*;

public class Validvoter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int A = sc.nextInt();
        if (A < 18) {
            int B = 18 - A;
            System.out.println( "Hello" + name + " , you will be eligible to vote in " + B + " years");
        }
        else{
            System.out.println("Hello" + name + ", you are a voter");
        }
        sc.close();
    }
}