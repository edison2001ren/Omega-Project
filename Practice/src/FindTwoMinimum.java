/**
 * Created by sunl on 8/21/16.
 * Find two minimum integers in an integer array
 */
public class FindTwoMinimum {

    public int[] findTwoMin(int[] input) {

        if(input == null || input.length < 2) {
            return null;
        }
        else if(input.length == 2) {
            return input;
        }
        int[] resultArr = new int[2];
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int i = 0;
        while(i < input.length) {
            if(input[i] < firstMin && input[i] < secondMin) {
                secondMin = firstMin;
                firstMin = input[i];
                i++;
            }
            else if(input[i] > firstMin && input[i] <= secondMin) {
                secondMin = input[i];
                i++;
            }
            else
                i++;
                continue;
        }
        resultArr[0] = firstMin;
        resultArr[1] = secondMin;
        return resultArr;
    }

    public static void main(String[] args) {
        int[] inputArray = {2, 1, 1, 10, 34, 1};
        FindTwoMinimum obj = new FindTwoMinimum();
        System.out.println("Here are the two minimum numbers: ");
        for(int e: obj.findTwoMin(inputArray)) {
            System.out.println(e + " ");
        }
    }
}
