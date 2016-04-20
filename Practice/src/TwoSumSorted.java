/**
 * Created by sunl on 4/19/16.
 */
public class TwoSumSorted {

    public boolean calcTwoSumSorted(int[] array, int target) {

        if(array.length < 2) {
            return false;
        }

        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex < endIndex) {
            if(array[startIndex] + array[endIndex] == target ) {
                System.out.println(array[startIndex] + ", "  + array[endIndex]);
                return true;
            }
            else if(array[startIndex] + array[endIndex] < target) {
                startIndex++;
            }
            else endIndex--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2 , 5, 7, 7, 10, 15, 18};
        int targetNum = 28;
        TwoSumSorted obj = new TwoSumSorted();
        if(obj.calcTwoSumSorted(inputArray, targetNum)) {
            System.out.println("Found two numbers!!");
        }
        else
            System.out.println("Not found two numbers!!");
    }
}
