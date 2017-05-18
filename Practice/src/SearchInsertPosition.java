/**
 * Created by sunl on 5/9/17.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int ret= 0;
        while(low<=high) {
            int mid = (low+high)/2;
            if(target < nums[0]) {
                ret = 0;
                break;
            }
            else if(target > nums[nums.length -1]) {
                ret = high + 1;
                break;
            }
            else if(nums[mid] == target) {
                ret = mid;
                break;
            }
            else if(target>=nums[mid] && target<=nums[mid+1]) {
                ret = mid + 1;
                break;
            }
            else if(target>nums[mid]) {
                low = mid + 1;
            }
            else if(target<nums[mid]) {
                high = mid - 1;
            }
        }
        return ret;
    }

    public int searchInsertSolution(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1,3};
        int tar = 2;
        SearchInsertPosition obj = new SearchInsertPosition();
        System.out.println("This number should be inserted at index: " + obj.searchInsert(arr, tar));
        System.out.println("This number should be inserted at index: " + obj.searchInsertSolution(arr, tar));
    }
}
