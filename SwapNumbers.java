import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Display the original numbers
        System.out.println("Before swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap the numbers using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display the swapped numbers
        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}
