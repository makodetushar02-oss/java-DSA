package String_in_java;

import java.util.Scanner;

public class sortThewordAccordingtolexicography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = 0; j <arr.length - i - 1 ; j++) {
                if(arr[j].compareTo(arr[j+1]) >0 ){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
        String Ans = " ";
        for (int i = 0; i < arr.length ; i++) {
            Ans += arr[i] + " ";
        }
        System.out.println(Ans);
    }
}
