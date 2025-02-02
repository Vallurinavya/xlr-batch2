import java.util.Scanner;
class Demo18{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the minutes: ");
        int min=scanner.nextInt();
        int minutesperyear= 525600;
        int minutespermonth= 43800;
        int Remainingmonths=min%minutesperyear;
        int months=Remainingmonths/minutespermonth;
        System.out.println("Years="+min/minutesperyear);
        //System.out.println("Remainingmonths= "+Remainingmonths);
        System.out.println("Months= "+months);
        scanner.close();

    }
}