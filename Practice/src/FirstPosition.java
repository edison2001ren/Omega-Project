/**
 * Created by sunl on 3/18/16.
 */
public class FirstPosition {

    public static int binarySearch(int[] nums, int target) {

        int index = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>target) {
                index=-1;
                break;
            }
            else if (nums[i]==target){
                index=i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] numArray = {2,6,8,13,15,17,17,18,19,20};
        int targetNum = 15;
        System.out.println("The first position of this target number is: " + FirstPosition.binarySearch(numArray, targetNum));
    }
}
