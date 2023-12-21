package code;

public class OddEvenChecker {
    public static void main(String[] args) {
        int number = 15; // Example number

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else { // Covers all cases where number is not even
            System.out.println(number + " is odd");
        }
    }
}