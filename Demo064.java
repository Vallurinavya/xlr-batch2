import java.util.Arrays;

public class Demo064 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Example array
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        
        swapFirstLast(arr);
        
        System.out.println("Array after swapping first and last element: " + Arrays.toString(arr));
    }

    public static void swapFirstLast(int[] arr) {
        if (arr.length > 1) { 
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
    }
}