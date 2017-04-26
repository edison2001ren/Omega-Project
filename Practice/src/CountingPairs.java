import java.util.Hashtable;

/**
 * Created by sunl on 4/25/17.
 */
public class CountingPairs {

    public int countPairs(int[] input, int k) {

        int count = 0;
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for(int num : input) {
            if(!ht.containsKey(num)) {
                ht.put(num, 0);
                if(ht.containsKey(num - k)) {
                    count++;
                    ht.remove(num - k);
                }
                else if(ht.containsKey(num + k)) {
                    count++;
                    ht.remove(num + k);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {8,12,16,4,0,20};
        int k = 4;
        CountingPairs obj = new CountingPairs();
        System.out.println("We found " + obj.countPairs(arr, k) + " pairs");
    }
}
