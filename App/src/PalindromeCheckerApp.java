import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    // Stack-based palindrome check
    public static boolean stackCheck(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) stack.push(ch);
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) return false;
        }
        return true;
    }

    // Deque-based palindrome check
    public static boolean dequeCheck(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : input.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }
        return true;
    }

    // Reverse String method check
    public static boolean stringReverseCheck(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }

    public static void main(String[] args) {
        // Welcome & Initialization
        System.out.println("=====================================");
        System.out.println("     Welcome to PalindromeCheckerApp");
        System.out.println("=====================================");
        System.out.println("Version : 13");
        System.out.println("Author  : Neha");
        System.out.println("-------------------------------------");

        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter a string to test performance: ");
        String input = scanner.nextLine();

        // Stack Approach
        long startStack = System.nanoTime();
        boolean stackResult = stackCheck(input);
        long endStack = System.nanoTime();

        // Deque Approach
        long startDeque = System.nanoTime();
        boolean dequeResult = dequeCheck(input);
        long endDeque = System.nanoTime();

        // String Reverse Approach
        long startString = System.nanoTime();
        boolean stringResult = stringReverseCheck(input);
        long endString = System.nanoTime();

        // Display results
        System.out.println("\nPerformance Comparison Results:");
        System.out.println("Stack Method Result: " + stackResult + ", Time: " + (endStack - startStack) + " ns");
        System.out.println("Deque Method Result: " + dequeResult + ", Time: " + (endDeque - startDeque) + " ns");
        System.out.println("String Reverse Method Result: " + stringResult + ", Time: " + (endString - startString) + " ns");

        scanner.close();
    }
}