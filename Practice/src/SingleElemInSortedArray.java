/**
 * Created by sunl on 5/7/17.
 */
public class SingleElemInSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(low<=high) {
            mid = (low+high)/2;
            if(low == high) {
                return nums[mid];
            }
            else if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) {
                return nums[mid];
            }
            else if((mid%2==0 && nums[mid] == nums[mid-1]) || (mid%2!=0 && nums[mid] == nums[mid+1])) {
                high = mid-1;
            }
            else if((mid%2!=0 && nums[mid] == nums[mid-1]) || (mid%2==0 && nums[mid] == nums[mid+1])) {
                low = mid+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3};
        SingleElemInSortedArray obj = new SingleElemInSortedArray();
        System.out.println("Single element is: " + obj.singleNonDuplicate(arr));
    }
}
