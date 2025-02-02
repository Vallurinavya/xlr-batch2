import java.util.Scanner;
class demo2{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter element a:");
        int a=scanner.nextInt();
        System.out.println("Enter element b:");
        int b=scanner.nextInt();
        if(a>b){
            System.out.println("Element a is greater than b");
        }
        else if(a<b){
System.out.println("Element b is greater than a");
        } else{
            System.out.println("both are same");
        }
        }
        }