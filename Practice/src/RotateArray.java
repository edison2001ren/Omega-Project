import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sunl on 4/24/17.
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        if(k > 0 && k < nums.length) {
            int queue_size = nums.length - k;
            Queue pq = new LinkedList();
            for(int i = queue_size; i<nums.length; i++) {
                pq.add(nums[i]);
            }
            for(int i = 0; i<queue_size; i++) {
                pq.add(nums[i]);
            }
            for(int i = 0; i<nums.length; i++) {
                nums[i] = (Integer)pq.poll();
            }
        }
        else if(k > nums.length) {
            Queue pq = new LinkedList();
            for(int i=nums.length-1; i>=0; i--) {
                pq.add(nums[i]);
            }
            for(int i = 0; i<nums.length; i++) {
                nums[i] = (Integer)pq.poll();
            }
        }
        HelperMethod.printArray(nums);
    }

    public static void main(String[] args) {
        int[] arr = {1,2};
        RotateArray obj = new RotateArray();
        obj.rotate(arr, 3);
    }
}
