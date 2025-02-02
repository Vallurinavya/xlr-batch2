import java.util.Scanner;
class Demo14{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the value of i: ");
       int i=scanner.nextInt();
        System.out.println("++i= "+(++i));
         System.out.println("i++= "+(i++));
          System.out.println(i);
          System.out.println("--i= "+(--i));
         System.out.println("i--= "+(i--));
          System.out.println(i);
    }
}