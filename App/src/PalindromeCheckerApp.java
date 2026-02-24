import java.util.Scanner;
public class PalindromeCheckerApp{
/**
 *

 * MAIN CLASS - UseCasePalindromeCheckerApp

 * Use Case 4: Character Array Based Validation

 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.

 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.

 *
 * author Developer
 * version 4.0
 */

    public static void main(String[] args){
        // Welcome and Initialization Message
        System.out.println("=====================================");
        System.out.println("     Welcome to PalindromeCheckerApp");
        System.out.println("=====================================");
        System.out.println("Version : 4.0");
        System.out.println("Author  : Neha");
        System.out.println("-------------------------------------");

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter a string to check: ");
        String inputString = scanner.nextLine();

        // Convert string to character array
        char[] charArray = inputString.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        // Close scanner
        scanner.close();
    }
}