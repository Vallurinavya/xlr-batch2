import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        System.out.print("Enter the fourth number: ");
        int number4 = scanner.nextInt();

        
        int biggest = number1;

        if (number2 > biggest) {
            biggest = number2;
        }
        if (number3 > biggest) {
            biggest = number3;
        }
        if (number4 > biggest) {
            biggest = number4;
        }

        System.out.println("The biggest number is: " + biggest);
    }
}
