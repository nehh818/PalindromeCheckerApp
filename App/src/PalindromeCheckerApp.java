
public class PalindromeCheckerApp{
/**
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * Use Case 2: Hardcoded Palindrome Checker App
 * Description:
 * This class demonstrates basic palindrome validation using a hardcoded string value
 * At this stage, the application:
 * - Stores predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 * This use case introduces fundamental comparison logic
 * before using advanced data structures
 * author Developer
 * version 2.0
 */

    public static void main(String[] args){
        System.out.println("Author Neha");
        System.out.println("Version 2.0");

        String word = "madam";
        String reverse = "";

        for(int i = word.length()-1; i >=0 ; i--){
            reverse += word.charAt(i);
        }
        if (word.equals(reverse)) {
            System.out.println("Is it a Palindrome?: true");
        }else{
            System.out.println("Is it a Palindrome?: false");

        }


    }
}