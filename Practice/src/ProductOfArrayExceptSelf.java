/**
 * Created by sunl on 4/21/17.
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int result = 1;
        for(int num : nums) {
            result *= num;
        }
        try {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = result / nums[i];
            }
        }
        catch (Exception e){
            String message = e.getMessage();
            System.out.println(message);
            System.exit(0);
        }
        return nums;
    }

    public int[] productExceptSelfAnswer(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] initial = {1, 2, 3, 4};
        int[] initial2 = {1, 2, 3, 4};
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        for(int num: obj.productExceptSelf(initial)) {
            System.out.print(num + ", ");
        }
        System.out.println("\nAnswer: ");
        for(int num: obj.productExceptSelfAnswer(initial2)) {
            System.out.print(num + ", ");
        }
    }
}
