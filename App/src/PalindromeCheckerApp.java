import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Welcome & Initialization Message
        System.out.println("=====================================");
        System.out.println("     Welcome to PalindromeCheckerApp");
        System.out.println("=====================================");
        System.out.println("Version : 10");
        System.out.println("Author  : Neha");
        System.out.println("-------------------------------------");

        Scanner scanner = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter a string to check: ");
        String inputString = scanner.nextLine();

        // Normalize string: remove spaces and convert to lowercase
        String normalizedString = inputString.replaceAll("\\s+", "").toLowerCase();

        // Reverse normalized string
        String reversedString = "";
        for (int i = normalizedString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + normalizedString.charAt(i);
        }

        // Compare original and reversed normalized strings
        if (normalizedString.equals(reversedString)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}