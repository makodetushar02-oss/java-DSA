package String_in_java;

import java.util.Arrays;

public class methods {

    public static void main(String[] args) {

        // 1. concat()
        String s1 = "hello";
        s1 = s1.concat(" bhai");
        System.out.println("Concat: " + s1);

        // 2. split()
        String s2 = "hel lo aur bhai kaise ho";
        String[] words = s2.split(" ");
        System.out.println("Split: " + Arrays.toString(words));

        // 3. Print integer array
        int[] numbers = {1, 2, 3};

        System.out.println("Integer Array:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // 4. Print characters using toCharArray()
        String s3 = "abcdefg";

        System.out.println("Characters:");
        for (char ch : s3.toCharArray()) {
            System.out.println(ch);
        }

        // 5. split() with commas
        String s4 = "a,b,,c,";
        String[] parts = s4.split(",");

        System.out.println(Arrays.toString(parts));
        System.out.println("Length = " + parts.length);

        // 6. Reverse String using charAt()
        String s5 = "hello";
        String rev = "";

        for (int i = s5.length() - 1; i >= 0; i--) {
            rev += s5.charAt(i);
        }

        System.out.println("Reverse = " + rev);

        // 7. Reverse using swapping
        String s6 = "hello";
        char[] chars = s6.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        String reversed = new String(chars);

        System.out.println("Reverse using swap = " + reversed);
    }
}