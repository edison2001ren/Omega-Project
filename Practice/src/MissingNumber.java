/**
 * Created by sunl on 4/23/17.
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int result = nums.length;
        for(int i=0; i<nums.length;i++) {
            result ^= i;
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {0,1};
        MissingNumber obj = new MissingNumber();
        System.out.println(obj.missingNumber(array) + " is missing!");
    }
}
