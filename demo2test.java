import java.util.Scanner; 
public class demo2test { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Are you participating? (yes/no): ");
          String response = scanner.nextLine();
          if (response.equalsIgnoreCase("yes")) { 
            System.out.println("Happy Sankrathi to all the participants!");
         } else {
             System.out.println("Maybe next time!"); }
              scanner.close();
             } 
            }
        
