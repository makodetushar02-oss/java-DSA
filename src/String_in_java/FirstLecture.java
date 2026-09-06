package String_in_java;

public class FirstLecture {
    public static void main(String[] args) {

        // =====================================================
        // STRING DECLARATION
        // =====================================================

        // String Literal (Stored in String Constant Pool)
        String s = "hello";

        System.out.println("Original String : " + s);

        // =====================================================
        // 1. charAt(index)
        // Returns the character present at the given index.
        // Index starts from 0.
        // =====================================================
        System.out.println("\n1. charAt()");
        System.out.println(s.charAt(3));   // Output: l

        // =====================================================
        // 2. length()
        // Returns the total number of characters in the string.
        // =====================================================
        System.out.println("\n2. length()");
        System.out.println(s.length());    // Output: 5

        // =====================================================
        // 3. toUpperCase()
        // Converts all characters into uppercase.
        // Original string remains unchanged because String is immutable.
        // =====================================================
        System.out.println("\n3. toUpperCase()");
        System.out.println(s.toUpperCase()); // HELLO

        // =====================================================
        // 4. toLowerCase()
        // Converts all characters into lowercase.
        // =====================================================
        System.out.println("\n4. toLowerCase()");
        System.out.println(s.toLowerCase()); // hello

        // =====================================================
        // 5. indexOf()
        // Returns the index of the first occurrence of a character.
        // Returns -1 if character is not found.
        // =====================================================
        System.out.println("\n5. indexOf()");
        System.out.println(s.indexOf('l')); // 2

        // =====================================================
        // 6. lastIndexOf()
        // Returns the index of the last occurrence of a character.
        // =====================================================
        System.out.println("\n6. lastIndexOf()");
        System.out.println(s.lastIndexOf('l')); // 3

        // =====================================================
        // 7. trim()
        // Removes spaces from the beginning and end of the string.
        // =====================================================
        String str = "   Hello Java   ";
        System.out.println("\n7. trim()");
        System.out.println("Before Trim : '" + str + "'");
        System.out.println("After Trim  : '" + str.trim() + "'");

        // =====================================================
        // 8. substring(beginIndex, endIndex)
        // Returns characters from beginIndex to endIndex-1.
        // =====================================================
        System.out.println("\n8. substring(begin,end)");
        System.out.println(s.substring(0, s.length())); // hello
        System.out.println(s.substring(1, 4));          // ell

        // =====================================================
        // 9. substring(beginIndex)
        // Returns characters from beginIndex till the end.
        // =====================================================
        System.out.println("\n9. substring(begin)");
        System.out.println(s.substring(2)); // llo
        System.out.println(s.substring(5)); // Empty String

        // =====================================================
        // STRING LITERALS
        // Same value literals share the same memory location
        // (String Constant Pool).
        // =====================================================
        String s1 = "Golu";
        String s2 = "Golu";

        // =====================================================
        // STRING OBJECTS
        // Every 'new' keyword creates a new object in Heap Memory.
        // =====================================================
        String s3 = new String("Polu");
        String s4 = new String("Polu");

        // =====================================================
        // 10. == Operator
        // Compares memory addresses (references), not values.
        // =====================================================
        System.out.println("\n10. == Operator");
        System.out.println(s1 == s2); // true (same pool object)
        System.out.println(s3 == s4); // false (different objects)

        // =====================================================
        // 11. equals()
        // Compares only the values of strings.
        // =====================================================
        System.out.println("\n11. equals()");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s3.equals(s4)); // true

        // =====================================================
        // 12. compareTo()
        // Lexicographically compares two strings.
        //
        // Returns:
        // 0  -> Strings are equal
        // +ve -> First string is greater
        // -ve -> First string is smaller
        // =====================================================
        System.out.println("\n12. compareTo()");
        System.out.println("aaaaaaa".compareTo("aab")); // -1
        System.out.println("dbc".compareTo("abc"));     // 3
        System.out.println("abc".compareTo("dbc"));     // -3
        System.out.println("aaa".compareTo("aaa"));     // 0

        // =====================================================
        // 13. String Constructors
        // =====================================================

        // Default Constructor
        String empty = new String();
        System.out.println("\n13. Default Constructor");
        System.out.println("'" + empty + "'");

        // Parameterized Constructor
        String word = new String("abc");
        System.out.println("\n14. Parameterized Constructor");
        System.out.println(word);

        // =====================================================
        // 15. concat()
        // Joins two strings.
        // Since String is immutable, store the result in another variable.
        // =====================================================
        System.out.println("\n15. concat()");
        String a = "Hello";
        String b = a.concat(" World");
        System.out.println(b);

        // =====================================================
        // 16. contains()
        // Checks whether a string contains a specific sequence.
        // Returns true or false.
        // =====================================================
        System.out.println("\n16. contains()");
        System.out.println("Programming".contains("gram")); // true

        // =====================================================
        // 17. startsWith()
        // Checks whether the string starts with given characters.
        // =====================================================
        System.out.println("\n17. startsWith()");
        System.out.println("Programming".startsWith("Pro")); // true

        // =====================================================
        // 18. endsWith()
        // Checks whether the string ends with given characters.
        // =====================================================
        System.out.println("\n18. endsWith()");
        System.out.println("Programming".endsWith("ing")); // true

        // =====================================================
        // 19. replace()
        // Replaces one character or string with another.
        // =====================================================
        System.out.println("\n19. replace()");
        System.out.println("banana".replace('a', 'o')); // bonono

        // =====================================================
        // 20. isEmpty()
        // Returns true if the string length is 0.
        // =====================================================
        System.out.println("\n20. isEmpty()");
        System.out.println(empty.isEmpty()); // true

        // =====================================================
        // 21. equalsIgnoreCase()
        // Compares strings without considering uppercase/lowercase.
        // =====================================================
        System.out.println("\n21. equalsIgnoreCase()");
        System.out.println("JAVA".equalsIgnoreCase("java")); // true

        // =====================================================
        // 22. split()
        // Splits a string into an array using the given delimiter.
        // =====================================================
        System.out.println("\n22. split()");
        String sentence = "Java is easy";
        String[] arr = sentence.split(" ");

        for (String word1 : arr) {
            System.out.println(word1);
        }

        // =====================================================
        // END OF PROGRAM
        // =====================================================
    }
}

