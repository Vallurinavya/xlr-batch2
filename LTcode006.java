public class LTcode006 {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int x : nums) {
            if (k == 0 || x != nums[k - 1]) {
                nums[k++] = x;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        LTcode006 solution = new LTcode006();
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        int k = solution.removeDuplicates(nums);
        System.out.println("Length of array after removing duplicates: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}