import java.util.Scanner;
class Demo16{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any string: ");
        String s=scanner.next();
         String reversed = new StringBuilder(s).reverse().toString();
        if(s.equals(reversed)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
        scanner.close();
    }
}