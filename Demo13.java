import java.util.Scanner;
class Demo13{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        float b=scanner.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        float h=scanner.nextFloat();
        System.out.println("The area of the triangle is: "+0.5*b*h);
    }
}