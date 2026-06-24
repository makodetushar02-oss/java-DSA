package Arguments;

import java.util.Scanner;

public class demo{
    public static void fun(int a){
        a++;
        System.out.println(a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        fun(a);
        System.out.println(a);
    }

}
