/**
 * Created by sunl on 4/24/17.
 */
public class RotateArray2 {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        HelperMethod.printArray(nums);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        RotateArray2 obj = new RotateArray2();
        obj.rotate(arr, 3);
    }
}
