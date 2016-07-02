/**
 * Created by sunl on 7/1/16.
 */
public class PartitionArrayOddEven {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public int[] partitionArray(int[] nums) {

        for(int i=0; i<nums.length-1; i++) {
            if(isOdd(nums[i])) {
                continue;
            }
            else if(!isOdd(nums[i])) {
                int k=i+1;
                while((k<nums.length)) {
                    if(isOdd(nums[k])) {
                        swap(i, k, nums);
                        break;
                    }
                    else if(!isOdd(nums[k])) {
                        k++;
                        continue;
                    }
                }
            }
        }
        return nums;
        // write your code here;
    }

    public void swap(int a, int b, int[] array) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public boolean isOdd(int num) {
        if(num%2==1) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        int[] array = {2147483644,2147483645,2147483646,2147483647};
        PartitionArrayOddEven obj = new PartitionArrayOddEven();
        for(int j : obj.partitionArray(array)) {
            System.out.print(j + " ");
        }
    }
}
