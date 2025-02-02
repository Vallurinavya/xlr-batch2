import java.util.Scanner;
class Demo12{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float radius=scanner.nextFloat();
       // area=3.14*radius^2;
        System.out.println("Area of the circle is: "+3.14*Math.pow(radius, 2));
    }
}