package code;

public class BooleanOps {
    public static void main(String[] args) {
        // Example 1
        int a = 2, b = 3;
        boolean c = (a > 2) && (++b > 3);
        System.out.println("a = " + a + " b = " + b + " c = " + c);
        // Example 2
        a = 2;
        b = 3;
        boolean d = (a > 2) || (++b > 3);
        System.out.println("a = " + a + " b = " + b + " c = " + d);
    }
}
