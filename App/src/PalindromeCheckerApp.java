import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp{
/**
 *

 * MAIN CLASS - UseCasePalindromeCheckerApp

  Use Case 5: Stack Based Palindrome Checker

 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.

 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result

 This maps stack behavior to reversal Logic.

 *
 * author Developer
 * version 5.0
 */

    public static void main(String[] args){
        // Welcome and Initialization Message
        System.out.println("=====================================");
        System.out.println("     Welcome to PalindromeCheckerApp");
        System.out.println("=====================================");
        System.out.println("Version : 5.0");
        System.out.println("Author  : Neha");
        System.out.println("-------------------------------------");

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter a string to check: ");
        String inputString = scanner.nextLine();

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        // Pop characters and build reversed string
        String reversedString = "";

        while (!stack.isEmpty()) {
            reversedString = reversedString + stack.pop();
        }

        // Compare original and reversed string
        if (inputString.equals(reversedString)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        // Close scanner
        scanner.close();
    }
}