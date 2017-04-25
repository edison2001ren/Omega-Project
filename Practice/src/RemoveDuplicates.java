/**
 * Created by sunl on 4/17/16.
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] numList = {-14,-14,-14,-14,-13,-13,-12};
        RemoveDuplicates rd = new RemoveDuplicates();
        int length = rd.removeDuplicates(numList);
        System.out.println("The final length is: " + length);
    }
}
