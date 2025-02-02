import java.util.Scanner;
class Demo09 {
    private Scanner scanner = new Scanner(System.in);
    String customerName() {
        System.out.print("Enter the name: ");
        return scanner.nextLine();
    }
    String accountNumber() {
        System.out.print("Enter the account number: ");
        return scanner.nextLine();
    }
    double balance() {
        System.out.print("Enter the balance amount: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input. Please enter a numeric balance amount: ");
            scanner.next(); 
        }
        return scanner.nextDouble();
    }
    public static void main(String[] args) {
        Demo09 ob = new Demo09();
        String name = ob.customerName();
        String accNo = ob.accountNumber();
        double balance = ob.balance();
        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.printf("Balance: %.2f\n", balance);
        ob.scanner.close();
    }
}