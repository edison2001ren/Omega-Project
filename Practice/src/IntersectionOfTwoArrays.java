import java.util.Hashtable;
import java.util.ArrayList;

/**
 * Created by sunl on 4/26/17.
 */
public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums1 == null) {
            return nums1;
        }
        else if(nums2.length == 0 || nums2 == null) {
            return nums2;
        }
        else {
            ArrayList<Integer> resultArr = new ArrayList<Integer>();
            Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
            for(int i : nums1) {
                if(ht.containsKey(i)) {
                    int freq1 = ht.get(i);
                    freq1++;
                    ht.put(i, freq1);
                }
                else {
                    ht.put(i, 1);
                }
            }
            for(int j : nums2) {
                if(ht.containsKey(j)) {
                    if(ht.get(j) == 1) {
                        resultArr.add(j);
                        ht.remove(j);
                    }
                    else {
                        int freq2 = ht.get(j);
                        freq2--;
                        resultArr.add(j);
                        ht.put(j, freq2);
                    }
                }
            }
            int[] r = new int[resultArr.size()];
            for(int i = 0; i < resultArr.size(); i++)
            {
                r[i] = resultArr.get(i);
            }

            return r;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,1};
        int[] arr2 = {1,1};
        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();
        HelperMethod.printArray(arr1);
        HelperMethod.printArray(arr2);
        System.out.println("The intersection of two arrays are: ");
        HelperMethod.printArray(obj.intersect(arr1, arr2));
    }
}
