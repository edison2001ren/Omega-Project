import java.util.HashMap;

/**
 * Created by sunl on 4/6/16.
 */
public class TwoSum2 {

    public boolean calcTwoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int x = numbers[i];
            if (map.containsKey(target - x)) {
                System.out.println(x + " and " + (target - x));
                return true;
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] inputArray = {8, 1 , 12, 1, 5, 1, 2, 10};
        int targetNum = 14;
        TwoSum2 obj = new TwoSum2();
        if(obj.calcTwoSum(inputArray, targetNum)) {
            System.out.println("Found two numbers!!");
        }
        else
            System.out.println("Not found two numbers!!");
    }
}
