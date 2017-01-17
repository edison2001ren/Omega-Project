/**
 * Created by sunl on 1/11/17.
 */
public class OrderedArrayInsertion {

    public void orderedArrayInsertion(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;
        int insertionIndex = 0;

        while (nums[low] <= nums[high]) {

            if(nums[high] < target && nums[high - 1] == 0) {
                nums[high] = target;
                break;
            }
            else if(nums[mid] >= target && nums[mid - 1] <= target) {
                insertionIndex = mid;
                break;
            } else if (nums[mid] < target) {
                low = mid;
                mid = (low + high) / 2;
            } else if (nums[mid] > target) {
                high = mid;
                mid = (low + high) / 2;
            }
        }
        if (insertionIndex == 0) {
            insertionIndex = high;
        }
        int temp;
        while(insertionIndex < nums.length) {
            temp = nums[insertionIndex];
            nums[insertionIndex] = target;
            target = temp;
            insertionIndex++;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }

    }

    public static void main(String[] args) {

        //int[] numArray = {2,6,8,13,15,17,17,18,19,20};
        int[] numArray = new int[10];

        OrderedArrayInsertion ordered_array = new OrderedArrayInsertion();
        System.out.println("The array after the insertion is: ");
        ordered_array.orderedArrayInsertion(numArray, 23);
        System.out.println();
        ordered_array.orderedArrayInsertion(numArray, 43);
        System.out.println();
        ordered_array.orderedArrayInsertion(numArray, 12);
        System.out.println();
        ordered_array.orderedArrayInsertion(numArray, 78);
        System.out.println();
        ordered_array.orderedArrayInsertion(numArray, 1);
        System.out.println();
        ordered_array.orderedArrayInsertion(numArray, 34);
        System.out.println();
        ordered_array.orderedArrayInsertion(numArray, 68);
        System.out.println();
        ordered_array.orderedArrayInsertion(numArray, 56);
        System.out.println();
    }
}