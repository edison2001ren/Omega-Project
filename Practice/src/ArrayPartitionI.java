import java.util.Arrays;
/**
 * Created by sunl on 5/6/17.
 */
public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int k = 0; k < nums.length; k+=2) {
            sum+=nums[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        ArrayPartitionI obj = new ArrayPartitionI();
        System.out.println("The largest sum of minimum of each pair is: " + obj.arrayPairSum(arr));
    }
}
