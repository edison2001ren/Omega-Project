import java.util.HashMap;

/**
 * Created by sunl on 4/6/16.
 */
public class TwoSum2 {

    public boolean calcTwoSum(int[] numbers, int target) {

        try {
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
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public int[] twoSumAnswer(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {8, 1 , 12, 1, 5, 1, 2, 10};
        int targetNum = 21;
        TwoSum2 obj = new TwoSum2();
        if(obj.calcTwoSum(inputArray, targetNum)) {
            System.out.println("Found two numbers!!");
        }
        else
            System.out.println("Not found two numbers!!");

        System.out.println("Index of these numbers are: ");
        for(int element : obj.twoSumAnswer(inputArray, targetNum)) {
            System.out.print(element + "\t");
        }
    }
}
