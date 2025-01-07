import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word, number, or phrase: ");
        String input = scanner.nextLine();

        // Clean and check if input is a palindrome
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(cleanInput.equals(new StringBuilder(cleanInput).reverse().toString())
                ? "Palindrome" 
                : "Not a palindrome");

        scanner.close();
    }
}