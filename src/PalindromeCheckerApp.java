import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Palindrome Checker App =====");
        System.out.print("Enter a word or sentence: ");
        String userInput = scanner.nextLine();

        if (isPalindrome(userInput)) {
            System.out.println("Result: It is a Palindrome ✅");
        } else {
            System.out.println("Result: It is NOT a Palindrome ❌");
        }

        scanner.close();
    }
}
