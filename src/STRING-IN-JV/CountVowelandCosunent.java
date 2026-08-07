package String;

import java.util.Scanner;

public class CountVowelandCosunent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        int Vowel = 0;
        int constant = 0;
        int Space = 0 ;
        int n = s.length();
        for(int i =0; i< n; i++ ){
            char ch = Character.toLowerCase(s.charAt(i));
            switch (ch){
                case 'a','e','u','i','o'->{
                    Vowel++;
                }
                case ' ' ->  Space++ ;
                default ->{
                    if(Character.isLetter(ch)){
                        constant++ ;
                    }
                }

            }
        }
        System.out.println("Vowel :"+ Vowel +"/nConsonant :"+ constant + "/nSpace :"+ Space);
    }
}
