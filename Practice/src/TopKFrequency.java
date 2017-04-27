import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

/**
 * Created by sunl on 4/27/17.
 */
public class TopKFrequency {

    public List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        for (int n : nums) {
            if(!frequencyMap.containsKey(n)) {
                frequencyMap.put(n, 1);
            }
            else {
                int number = frequencyMap.get(n);
                number++;
                frequencyMap.put(n, number);
            }
        }

        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<Integer>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> res = new ArrayList<Integer>();

        for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
            if (bucket[pos] != null) {
                res.addAll(bucket[pos]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
        TopKFrequency obj = new TopKFrequency();
        Iterator it = obj.topKFrequent(arr, k).iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
