public class LTcode001 {
    public static boolean isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        
        return original == reversed;
    }

    public static void main(String[] args) {
        int x = 121; 
        boolean result = isPalindrome(x);
        System.out.println(x + " is a palindrome: " + result);
    }
}
    
