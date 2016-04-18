/**
 * Created by sunl on 4/15/16.
 */
public class BinarySearch1 {

    public final static int NOT_FOUND = -1;
    public int binarySearch(int[] numArray, int target) {

        int low = 0;
        int high = numArray.length - 1;
        int mid = (low + high)/2;

        while(low <= high && numArray[mid] != target) {
            if(numArray[mid] > target) {
                high = mid - 1;
                mid = (low + high)/2;
            }
            else {
                low = mid + 1;
                mid = (low + high) / 2;
            }
        }
        if(low > high) {
            return NOT_FOUND;
        }
        else return mid;
    }

    public static void main(String[] args) {

        int[] inputArray = {2,6,8,13,15,17,17,18,19,20};
        int targetNum = 9;

        BinarySearch1 bs = new BinarySearch1();
        int result = bs.binarySearch(inputArray, targetNum);
        if(result != NOT_FOUND) {
            System.out.println("We found this number at index " + result + "!!!");
        }
        else
            System.out.println("This number does not exist!!!");
    }
}
