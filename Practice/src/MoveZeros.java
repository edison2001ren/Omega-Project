/**
 * Created by sunl on 6/3/16.
 */
public class MoveZeros {
    /**
     * @param nums an integer array
     * @return nothing, do this in-place
     */
    public void moveZeroes(int[] nums) {

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                int pos = i;
                for(int j=i+1; j<nums.length; i++,j++) {
                    if(nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        i++;
                    }
                    else
                        continue;
                }
                nums[i] = 0;
                i = pos;
                nums[i] = 0;
                i = pos;
            }
            else
                continue;
        }
        // Write your code here
    }

    public static void main(String[] args) {
        int[] inputArray = {0, 0, 1, 0};
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
