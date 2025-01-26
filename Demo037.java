import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.println(number1 + " is the biggest number.");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println(number2 + " is the biggest number.");
        } else {
            System.out.println(number3 + " is the biggest number.");
        }
    }
}
