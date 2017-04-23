/**
 * Created by sunl on 4/22/17.
 */
public class CheckSortedArray {

    private static int n;

    public boolean checkSorted(int[] array) {

        n = array.length;
        if (n == 1) {
            return true;
        }
        else {
            if(array[n - 1] < array[n - 2]) {
                return false;
            }
            else
                n--;
                return checkSorted(array);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        CheckSortedArray obj = new CheckSortedArray();
        System.out.println(obj.checkSorted(arr));
    }
}
