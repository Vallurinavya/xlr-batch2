import java.util.Arrays;

public class Demo065 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example array

        // Method 1: Using Arrays.toString()
        System.out.println("Array elements: " + Arrays.toString(arr));

        // Method 2: Using a for loop
        System.out.print("Array elements using loop: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}