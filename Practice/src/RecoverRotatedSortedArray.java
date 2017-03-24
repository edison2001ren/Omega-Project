/**
 * Created by sunl on 7/3/16.
 */
public class RecoverRotatedSortedArray {

    public int[] recoverRotatedSortedArray(int[] nums) {
        int currentIndex = 0;
        while((currentIndex < nums.length-1) && nums[currentIndex + 1] > nums[currentIndex]) {
            currentIndex++;
        }
        for(int i=currentIndex; i>=0; i--) {
            int temp = nums[i];
            int lastIndex = currentIndex;
            for(int j=currentIndex; j<=nums.length-2; j++) {
                nums[j] = nums[j+1];
                lastIndex++;
            }
            nums[lastIndex] = temp;
        }
        return nums;
        // write your code
    }

    public static void main(String args[]) {
        int[] unsorted = {2 ,3, 4, 1};

        RecoverRotatedSortedArray obj = new RecoverRotatedSortedArray();
        for(int k : obj.recoverRotatedSortedArray(unsorted)) {
            System.out.print(k + " ");
        }
    }
}
