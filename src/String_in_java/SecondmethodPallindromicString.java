package String_in_java;
import java.util.Scanner;

public class SecondmethodPallindromicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "" ;
        boolean ISPalindrom = true;
        int i =0 ;
        int j =s.length()-1;
        while (i< j){
            if ( s.charAt(i) != s.charAt(j)){
                ISPalindrom = false;
                break;
            }
            i++;
            j--;
        }
        if(ISPalindrom == true){
            System.out.println("String is Palindrom");
        }else {
            System.out.println("String is not Palindrom");
        }

    }
}
