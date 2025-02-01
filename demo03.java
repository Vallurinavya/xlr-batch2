import java.util.Scanner;
class demo03{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element a:");
        int a = scanner.nextInt();
        System.out.println("Enter element b: ");
        int b = scanner.nextInt();
        System.out.println("Enter element c: ");
        int c = scanner.nextInt();
        if(a>b && a>c){
            System.out.println("a  is greater than b&c");
        }
        else if( b>a && b>c){
            System.out.println("b  is greater than a&c");
        }
        else if(c>a && c>b){
            System.out.println("c  is greater than b&a");
        }
        else{
            System.out.println("some similar elements");
        }
    }
}