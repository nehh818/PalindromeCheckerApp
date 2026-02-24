import java.util.Scanner;
public class PalindromeCheckerApp{
/**
 *

 * MAIN CLASS - UseCase3PalindromeCheckerApp

 * Use Case 3: Reverse String Based Palindrome Check

 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result

 * This introduces transformation-based validation.
 * author Developer
 * version 2.0
 */

    public static void main(String[] args){
        System.out.println("Author Neha");
        System.out.println("Version 2.0");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String originalString = scanner.nextLine();

        String reversedString = "";

        // Reverse string using for loop
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }

        // Compare original and reversed string using equals()
        if (originalString.equals(reversedString)) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}