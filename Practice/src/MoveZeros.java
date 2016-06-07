import java.util.PriorityQueue;

/**
 * Created by sunl on 6/3/16.
 */
public class MoveZeros {
    /**
     * @param nums an integer array
     * @return nothing, do this in-place
     */
    public void moveZeroes(int[] nums) {

        boolean hasZero = false;
        PriorityQueue<Integer> prq = new PriorityQueue<Integer>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                prq.add(i);
                hasZero = true;
            }
            else if(nums[i] != 0 && hasZero == false) {
                continue;
            }
            else if(nums[i] != 0 && hasZero == true) {
                nums[prq.poll()] = nums[i];
                nums[i] = 0;
                prq.add(i);
                hasZero = true;
            }
        }
        // Write your code here
    }

    public static void main(String[] args) {
        int[] inputArray = {0, 1, 1, 1, 0, 1};
        for (int c : inputArray) {
            System.out.print(c + " ");
        }
        MoveZeros obj = new MoveZeros();
        obj.moveZeroes(inputArray);
        System.out.println("\n\nAfter moving all zeros:\n");
        for (int c : inputArray) {
            System.out.print(c + " ");
        }
    }
}
