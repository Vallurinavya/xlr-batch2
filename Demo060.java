public class Demo060 {
    public static void main(String[] args) {
        int n = 20; // Number of terms
        long first = 0, second = 1; // First two terms of Fibonacci sequence

        System.out.println("Fibonacci Series of " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            long next = first + second; // Calculate next term
            first = second; // Update first term
            second = next; // Update second term
        }
    }
}