/**
 * Created by sunl on 4/10/17.
 */
public class BinarySearch {

    public int binarySearch(int[] inputArray, int target) {

        int lowIndex = 0;
        int highIndex = inputArray.length - 1;
        int midIndex = 0;

        while(lowIndex < highIndex) {
            midIndex = (lowIndex + highIndex) / 2;
            if(inputArray[midIndex] < target) {
                lowIndex = midIndex + 1;
            }
            else if(inputArray[midIndex] > target) {
                highIndex = midIndex - 1;
            }
            else
                return inputArray[midIndex];
            System.out.println(lowIndex + " , " + highIndex);
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] inputArray = {2,6,8,13,15,17,17,18,19,20};
        int targetNum = 17;

        BinarySearch obj = new BinarySearch();
        int result = obj.binarySearch(inputArray, targetNum);
        if(result != -1) {
            System.out.println("We found this number !");
        }
        else
            System.out.println("This number does not exist!!!");
    }
}
