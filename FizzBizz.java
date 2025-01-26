public class FizzBizz {

    public static String getFizzBizz(int value) {
        if (value <= 0) {
            return "Error";
        }
        if (value % 3 == 0 && value % 5 == 0) {
            return "FIZZBIZZ";
        }
        if (value % 3 == 0) {
            return "FIZZ";
        }
        if (value % 5 == 0) {
            return "BIZZ";
        }
        return String.valueOf(value);
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(getFizzBizz(33));  // Output: FIZZ
        System.out.println(getFizzBizz(5));   // Output: BIZZ
        System.out.println(getFizzBizz(15));  // Output: FIZZBIZZ
        System.out.println(getFizzBizz(7));   // Output: 7
        System.out.println(getFizzBizz(-3));  // Output: Error
    }
}
