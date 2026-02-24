import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

// Strategy Interface
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean checkPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

// Context class to use strategy
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.checkPalindrome(input);
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Welcome & Initialization Message
        System.out.println("=====================================");
        System.out.println("     Welcome to PalindromeCheckerApp");
        System.out.println("=====================================");
        System.out.println("Version : 12");
        System.out.println("Author  : Neha");
        System.out.println("-------------------------------------");

        Scanner scanner = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter a string to check: ");
        String inputString = scanner.nextLine();

        // Choose strategy
        System.out.println("Select strategy: 1. Stack  2. Deque");
        int choice = scanner.nextInt();

        PalindromeContext context = new PalindromeContext();
        switch (choice) {
            case 1:
                context.setStrategy(new StackStrategy());
                break;
            case 2:
                context.setStrategy(new DequeStrategy());
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Stack strategy.");
                context.setStrategy(new StackStrategy());
        }

        // Execute strategy
        boolean result = context.executeStrategy(inputString);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}