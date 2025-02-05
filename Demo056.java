import java.util.*;
public class Demo056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a nunmber: ");
        int num = scanner.nextInt();
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            sum += digit*digit*digit;
            num /= 10; 
            
        }
        System.out.println("sum of cubes of the digits: " + sum);
    }
}