import java.util.Scanner;
class Demoo07{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Your Name:");
        String name=scanner.next();
        System.out.println("Your age:");
        String age=scanner.next();
        System.out.println("Your phno:");
        String phno=scanner.next();
        System.out.println("Welcome "+name);
        System.out.println("the age of "+name+ "is "+age);
        System.out.println("the contact number of "+name+"is"+phno);
    }
}