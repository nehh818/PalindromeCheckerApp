import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class encapsulates the palindrome checking logic
class PalindromeChecker {

    // Method to check if a string is a palindrome using Stack
    public boolean checkPalindrome(String inputString) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        // Pop characters and compare
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Welcome & Initialization Message
        System.out.println("=====================================");
        System.out.println("     Welcome to PalindromeCheckerApp");
        System.out.println("=====================================");
        System.out.println("Version : 11");
        System.out.println("Author  : Neha");
        System.out.println("-------------------------------------");

        Scanner scanner = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter a string to check: ");
        String inputString = scanner.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Check palindrome
        if (checker.checkPalindrome(inputString)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}