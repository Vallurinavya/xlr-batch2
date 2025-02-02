import java.util.Scanner;
public class Demo15 {
           public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int a,b,temp;
            System.out.println("Enter the value of a:");
            a=scanner.nextInt();
            System.out.println("Enter the value of b:");
            b=scanner.nextInt();
            System.out.println("Before swapping:"+"a= "+a+"b= "+b);
            temp=a;
            a=b;
            b=temp;
            System.out.println("After swapping:"+"a= "+a+"b= "+b);
        }
    } 