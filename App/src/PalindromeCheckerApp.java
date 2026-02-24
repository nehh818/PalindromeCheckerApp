import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp{
/**
 *

 * MAIN CLASS - UseCasePalindromeCheckerApp

 * Use Case 6: Queue + Stack Fairness Check

 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:

 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)

 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.

 * If all characters match, the input string is confirmed
 * as a palindrome.

 * This use case helps understand how FIFO and LIFO
 * behaviors can be combined for symmetric comparison.

 *

 *
 * author Developer
 * version 6.0
 */

    public static void main(String[] args){
        // Welcome and Initialization Message
        System.out.println("=====================================");
        System.out.println("     Welcome to PalindromeCheckerApp");
        System.out.println("=====================================");
        System.out.println("Version : 6.0");
        System.out.println("Author  : Neha");
        System.out.println("-------------------------------------");

        Scanner scanner = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter a string to check: ");
        String inputString = scanner.nextLine();

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push and Enqueue characters
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) with pop (stack)
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}