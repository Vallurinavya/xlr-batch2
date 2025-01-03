import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
       
        String correctUsername = "user001";
        String correctPassword = "pass";
        
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your username: ");
        String inputUsername = scanner.nextLine();

        
        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();

       
        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

       
        scanner.close();
    }
}
