/**
 * Created by sunl on 2/24/16.
 */
public class FindMajorityNumber {

    public static int majorityNumber(int[] nums) {

        int[] counter = new int[10000];
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
            if (counter[nums[i]] > (nums.length / 2 )) {
                result = nums[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numList = {111,222,111,111,222,343,90,90,111,111,111,0,111};

        System.out.print(FindMajorityNumber.majorityNumber(numList));
    }

}
