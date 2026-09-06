package Math_formula_in_java;
public class SwappingXOR {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap using XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nAfter swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}