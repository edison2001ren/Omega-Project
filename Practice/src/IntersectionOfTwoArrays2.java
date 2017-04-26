import java.util.Hashtable;
import java.util.ArrayList;
/**
 * Created by sunl on 6/6/16. Passed the compiler on 6/6/2016
 */
public class IntersectionOfTwoArrays2 {
    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @return an integer array
     */
    public static int[] intersection2(int[] nums1, int[] nums2) {

        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        if(nums1.length == 0) {
            return nums1;
        }
        else {
            ht.put(nums1[0], 1);
            for(int i = 1; i<nums1.length; i++) {
                if(ht.containsKey(nums1[i])) {
                    ht.put(nums1[i], ht.get(nums1[i]) + 1);
                }
                else
                    ht.put(nums1[i], 1);
            }
            ArrayList<Integer> intersection = new ArrayList<Integer>();
            int counter = 0;
            for(int j = 0; j<nums2.length; j++) {
                if(ht.containsKey(nums2[j]) && ht.get(nums2[j]) > 0) {
                    ht.put(nums2[j], ht.get(nums2[j]) - 1);
                    intersection.add(nums2[j]);
                    counter++;
                }
                else
                    continue;
            }
            // Write your code here
            int[] finalResult = new int[counter];
            for(int k = 0; k<intersection.size(); k++) {
                finalResult[k] = intersection.get(k);
            }

            return finalResult;
        }
    }

    public static void main(String[] args) {
        int[] numsArray1 = {1,1,1};
        int[] numsArray2 = {1,2,1};

        for (int c: IntersectionOfTwoArrays2.intersection2(numsArray1, numsArray2)) {
            System.out.print(c + " ");
        }
    }
}
