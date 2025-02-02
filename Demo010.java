import java.util.Scanner;
class Customer{
    String Cust_Name = "Prasunamba";
    long Account_no = 123456;
    Double Balance = 10000.00;
    void accept_details(){
        System.out.println("enter ur name, account no");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        Account_no = sc.nextLong();

    }
    void Display_details(){
        System.out.println("Hello "+Cust_Name);
        System.out.println("ur balance is "+ Balance);
    }
}
public class Demo010 {    
    public static void main(String[] args){
        Customer obj = new Customer();
        obj.accept_details();
        obj.Display_details();
    }
}