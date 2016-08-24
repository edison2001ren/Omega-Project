import java.util.HashMap;

/**
 * Created by sunl on 4/6/16.
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            int diff = (target - numbers[i]);
            if(hash.containsKey(diff)){
                int toReturn[] = {hash.get(diff)+1, i+1};
                return toReturn;
            }
            hash.put(numbers[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] inputArray = {8, 1, 12, 1, 5, 1, 2, 10};
        int targetNum = 14;
        TwoSum obj = new TwoSum();
        System.out.println("These 2 numbers' index are: ");
        for (int a : obj.twoSum(inputArray, targetNum)) {
            System.out.print(a + " ");
        }
    }
}
