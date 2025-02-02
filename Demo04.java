import java.util.Scanner;
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the value up to:");
        int n =scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
