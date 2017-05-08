import java.util.List;
import java.util.ArrayList;
/**
 * Created by sunl on 5/8/17.
 */
public class FindDisappearedNums {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> returnArr = new ArrayList<Integer>();
        for(int i = 1; i<=nums.length;i++) {
            returnArr.add(i);
        }
        for(int n : nums) {
            if(returnArr.contains(n)) {
                returnArr.remove(returnArr.indexOf(n));
            }
        }
        return returnArr;
    }

    public List<Integer> findDisappearedNumbersSolution(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        FindDisappearedNums obj = new FindDisappearedNums();
        System.out.println(obj.findDisappearedNumbers(arr).size());
        System.out.println(obj.findDisappearedNumbersSolution(arr).size());
    }
}
