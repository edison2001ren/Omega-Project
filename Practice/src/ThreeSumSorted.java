/**
 * Created by sunl on 4/19/16.
 */
public class ThreeSumSorted {

    public boolean calcThreeSumSorted(int[] array, int target) {

        if(array.length < 3) {
            return false;
        }

        int midIndex = 0;
        int endIndex = array.length - 1;
        for(int i=0; i<array.length-2; i++) {
            while (midIndex < endIndex) {
                if (array[i] + array[midIndex] + array[endIndex] == target) {
                    System.out.println(array[i] + ", " + array[midIndex] + ", " + array[endIndex]);
                    return true;
                } else if (array[i] + array[midIndex] + array[endIndex] < target) {
                    midIndex++;
                } else endIndex--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 5, 7, 7, 10, 15, 18};
        int targetNum = 29;
        ThreeSumSorted obj = new ThreeSumSorted();
        if(obj.calcThreeSumSorted(inputArray, targetNum)) {
            System.out.println("Found three numbers!!");
        }
        else
            System.out.println("Not found three numbers!!");
    }
}
