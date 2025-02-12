import java.util.Scanner;
public class Demo083{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        
        char firstChar = input.toLowerCase().charAt(0);

        if (isVowel(firstChar)) {
            System.out.println("The first character is a vowel.");
        } else {
            System.out.println("The first character is a consonant.");
        }
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

