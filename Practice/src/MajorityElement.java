import java.util.Hashtable;

/**
 * Created by sunl on 5/1/17.
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {

        if(nums.length == 1) {
            return nums[0];
        }
        int returnVal = 0;
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for(int e : nums) {
            if(!ht.containsKey(e)) {
                ht.put(e, 1);
            }
            else {
                int freq = ht.get(e);
                freq++;
                if(freq > nums.length / 2) {
                    returnVal = e;
                    break;
                }
                else
                    ht.put(e, freq);
            }
        }
        return returnVal;
    }

    public int majorityElementSolution(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;

        }
        return major;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,1,2,3,3,2,3,3,3,3,3};
        MajorityElement obj = new MajorityElement();
        System.out.println("The majority element is: " + obj.majorityElement(arr));
        System.out.println("The majority element is: " + obj.majorityElementSolution(arr));
    }
}
