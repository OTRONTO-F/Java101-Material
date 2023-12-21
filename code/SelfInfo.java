package code;

import java.util.Scanner;

public class SelfInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? : ");
        String name = scanner.nextLine();

        System.out.print("How old are you? : ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old and live in " + ".");
        scanner.close();
    }
}
