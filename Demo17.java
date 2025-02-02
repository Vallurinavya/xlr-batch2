import java.util.Scanner;
class Demo17{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int A =scanner.nextInt();
        int tens=A/10;
        int ones=A%10;
        int c=tens+ones;
        System.out.println("The sum of digit is= "+c);
    }
}