package code;

public class AboutMySelf {
   public static void main(String[] args) {
       // Declare variables
       String name = "Bard";
       double gpa = 3.9;
       boolean likeProgramming = true;
       System.out.println("Hello! My name is " + name + " who has GPA as " + gpa);
       // Check likeProgramming and print the appropriate message
       if (likeProgramming) {
           System.out.println(name + " likes Programming!");
       } else {
           System.out.println(name + " doesn't like Programming.");
       }
   }
}
