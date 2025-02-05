import java.util.*;
public class Demo057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = scanner.nextInt();

        int lastnum = num%10;
        int firstnum = num;

        while (firstnum >= 10) { 
            firstnum /= 10;
        }
        int sum = firstnum + lastnum;
        System.out.println("sum of 1st n last num: " + sum);
    }
}