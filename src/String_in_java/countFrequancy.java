package String_in_java;

import java.util.Scanner;

public class countFrequancy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int arr[] = new  int[128];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch] = arr[ch] +1 ;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                System.out.println((char)i+"->"+arr[i]);
            }
        }
    }
}
