import java.util.Scanner;
public class demo023{
    
    public static int isPalindrome(int number) {
        
        if (number <= 0) {
            return -1;
        }

        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            number = number / 10; 
        }
        return (originalNumber == reversedNumber) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result = isPalindrome(number);
        if (result == 1) {
            System.out.println(number + " is a palindrome.");
        } else if (result == 0) {
            System.out.println(number + " is not a palindrome.");
        } else {
            System.out.println("Invalid input: " + number + ". Please enter a positive number greater than zero.");
        }
        scanner.close();
    }
}