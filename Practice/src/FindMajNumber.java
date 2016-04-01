/**
 * Created by sunl on 2/24/16.
 */
public class FindMajNumber {

    public static int majorityNumber(int[] nums) {

        int[] counter = new int[10000];
        int major = 0;

        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
            if (counter[nums[i]] > (nums.length / 2 )) {
                major = nums[i];
            }
        }
        return major;
    }

    public static boolean verifyMajNumber(int[] array, int maj){
        int counter = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] == maj) {
                counter++;
            }
        }
        if(counter > (array.length) / 2) {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        int[] numList = {2, 2, 2, 1, 1, 1};
        int majorNumber = majorityNumber(numList);
        if(verifyMajNumber(numList, majorNumber)) {
            System.out.println("The majority number is: " + majorNumber);
        }
        else {
            System.out.println("This array does not have a majority number!");
        }
    }

}
