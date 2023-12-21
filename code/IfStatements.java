package code;

public class IfStatements {
    public static void main(String[] args) {
        String activity = "watchVideo"; // Example value for activity
        String playGame = "playGame";
        String watchVideo = "watchVideo";

        if (activity.equals(playGame)) {
            System.out.println("Don't have time to read a book");
        } else if (activity.equals(watchVideo)) {
            System.out.println("Which video are you watching");
        } else {
            System.out.println("Hopefully, you read a book or a slide before you come to class");
        }
    }
}