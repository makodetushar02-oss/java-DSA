package STRING-IN-JV ;

import java.util.Scanner;

public class SecondCountFrequancy {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int arr[] = new int[26];
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        arr[ch-97] = arr[ch-97] +1 ;
    }
    for (int i = 0; i <arr.length; i++) {
        if(arr[i] > 0){
            System.out.println((char)(i+97) + "->" + arr[i]);
        }
    }
}
}
