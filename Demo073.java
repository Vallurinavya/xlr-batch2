public class Demo073{

    public static void printDuplicates(int[] array) {
        boolean isDuplicate;
    
        for (int i = 0; i < array.length; i++) {
            isDuplicate = false;
            
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
        
            if (!isDuplicate) {
                for (int k = i + 1; k < array.length; k++) {
                    if (array[i] == array[k]) {
                        System.out.println(array[i]);
                        break; 
                    }
                }
            }
        }
    }
 public static void main(String[] args) {
        int[] arr = {12, 34, 56, 12, 34, 78, 56, 90, 45, 90};

        System.out.println("Duplicate elements in the array:");
        printDuplicates(arr);
    }
}