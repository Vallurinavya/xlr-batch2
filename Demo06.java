import java.util.Scanner;
class Demo06{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Username:");
        String username=scanner.next();
        System.out.println("Password:");
        String password=scanner.next();
        while(username.equals("Navya")&& password.equals("Navya@123")){
        System.out.println("Hello Navya");
        break;
        }
        if((username != "Navya")&&(password != "Navya@123")){
            System.out.println("invalid");
        }
    }
}