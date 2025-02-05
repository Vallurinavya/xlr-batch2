public class Demo063 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example array

        // Ensure the array is not empty
        if (arr.length > 0) {
            int sum = arr[0] + arr[arr.length - 1]; // Adding first and last element
            System.out.println("Sum of First and Last Element: " + sum);
        } else {
            System.out.println("Array is empty.");
 }
}
}