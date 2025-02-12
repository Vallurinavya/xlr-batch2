public class Demo076 {
    public static int findSecondMax(int[] array) {
            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    secondMax = max;  
                    max = array[i];   
                } else if (array[i] > secondMax && array[i] != max) {
                    secondMax = array[i];  
                }
            }
    if (secondMax == Integer.MIN_VALUE) {
                System.out.println("No second maximum element found");
                return -1;         
            }
    return secondMax;
        }
    public static void main(String[] args) {
            int[] arr = {12, 34, 56, 7, 89, 23, 45};
    
            int secondMax = findSecondMax(arr);
    
            if (secondMax != -1) {
                System.out.println("The second maximum number in the array is: " + secondMax);
            }
        }
    }