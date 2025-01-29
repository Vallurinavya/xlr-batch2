import java.util.Scanner;

public class Demo055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfSquares = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sumOfSquares += digit * digit;
            number /= 10;
        }
        
        System.out.println("The sum of the squares of the digits is: " + sumOfSquares);
        
        scanner.close();
    }
}
