/**
 * Created by sunl on 5/1/17.
 */
public class MaxSubarray {

    public int maxSubArray(int[] nums) {
        int maxCur = nums[0];
        int maxSoFar = nums[0];
        for(int i = 1; i<nums.length; i++) {
            maxCur = Math.max(nums[i], maxCur += nums[i]);
            maxSoFar = Math.max(maxSoFar, maxCur);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1};
        //int[] stock_prices = {-3, 0, 4, -1, 6, 0, 2, 7};
        MaxSubarray obj = new MaxSubarray();
        System.out.println("The maximum profit we can make is: " + obj.maxSubArray(arr));
    }
}
