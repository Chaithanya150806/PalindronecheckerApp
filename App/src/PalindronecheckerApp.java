import java.util.Stack;

// Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack implementation
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Create reversed string
        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        // Compare strings
        return input.equals(reversed.toString());
    }
}

// Main class
class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + result);
    }
}