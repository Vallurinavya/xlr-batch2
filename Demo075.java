public class Demo075 {
    public static int findMax(int[] array) {
                   int max = array[0];
            for (int i = 1; i < array.length; i++) {
               if (array[i] > max) {
                   max = array[i];
               }
           }
           return max;
       }
   
      public static void main(String[] args) {
           int[] arr = {12, 34, 56, 7, 89, 23, 45};
    int max = findMax(arr);
           System.out.println("The maximum number in the array is: " + max);
       }
   }