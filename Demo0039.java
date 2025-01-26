
// check character lowercase or uppercase -- Infosys

import java.util.Scanner;

class Check_case{
    String check_case(char ch){
        if(Character.isUpperCase(ch)==true)
            return "Upper";
        return "Lower";
    }
}
public class Demo0039 {
    public static void main(String[] args) {
        Check_case obj = new Check_case();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a char");
        char ch = sc.next().charAt(0);
        String res = obj.check_case(ch);
        System.out.println(res+ " case");
    }
}