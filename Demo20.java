import java.util.Scanner;
class Demo20{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
       if(num%3==0 && num%5==0){
        System.out.println("fizzbizz");
       }
       else if(num%5==0){
        System.out.println("bizz");
       }
       else if(num%3==0){
         System.out.println("fizz");
       }
       else{
        System.out.println("Not found");
       }
    }
}
