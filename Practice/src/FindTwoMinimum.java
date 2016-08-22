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
        int firstMin = input[0];
        int secondMin = input[1];
        int i = 2;
        while(i < input.length) {
            if(input[i] < firstMin && input[i] < secondMin) {
                int temp = firstMin;
                firstMin = input[i];
                if(temp < secondMin) {
                    secondMin = temp;
                }
                i++;
            }
            else if(input[i] > firstMin && input[i] <= secondMin) {
                secondMin = input[i];
                i++;
            }
            else if(input[i] > secondMin && input[i] <= firstMin) {
                firstMin = input[i];
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
        int[] inputArray = {0, 0, 2321, 231, 1, -2, 4, 2, 3, 4};
        FindTwoMinimum obj = new FindTwoMinimum();
        System.out.println("Here are the two minimum numbers: ");
        for(int e: obj.findTwoMin(inputArray)) {
            System.out.println(e + " ");
        }
    }
}
