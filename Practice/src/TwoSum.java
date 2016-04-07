import java.util.HashMap;

/**
 * Created by sunl on 4/6/16.
 */
public class TwoSum {

    private static boolean calcTwoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<numbers.length; i++) {
            int anotherNum = target - numbers[i];
            hm.put(numbers[i], anotherNum);
            if(hm.containsKey(anotherNum)) {
                System.out.println(numbers[i] + " : " + anotherNum);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] inputArray = {8, 1 , 12, 1, 5, 1, 2, 10};
        int targetNum = 14;
        TwoSum obj = new TwoSum();
        if(obj.calcTwoSum(inputArray, targetNum)) {
            System.out.println("Found two numbers!!");
        }
        else
            System.out.println("Not found two numbers!!");
    }
}
