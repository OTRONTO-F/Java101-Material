package code;

public class WhileLoop {
    public static void main(String[] args) {
        // Initialize sum
        float sum = 0;
        // Keep adding 0.1 to sum
        for (float i = 0.1f; i <= 1.0f; i = i + 0.1f) {
            System.out.println("The current sum is " + sum);
            sum += i;
        }
    }
}