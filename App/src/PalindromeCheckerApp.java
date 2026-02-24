import java.util.Scanner;

public class PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true; // Base case: crossed or met in middle
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false; // Mismatch found
        }
        return isPalindrome(str, start + 1, end - 1); // Recursive call
    }

    public static void main(String[] args) {
        // Welcome & Initialization Message
        System.out.println("=====================================");
        System.out.println("     Welcome to PalindromeCheckerApp");
        System.out.println("=====================================");
        System.out.println("Version : 9.0");
        System.out.println("Author  : Neha");
        System.out.println("-------------------------------------");

        Scanner scanner = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter a string to check: ");
        String inputString = scanner.nextLine();

        // Check palindrome recursively
        if (isPalindrome(inputString, 0, inputString.length() - 1)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}