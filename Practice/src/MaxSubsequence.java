/**
 * Created by sunl on 3/28/16.
 */
public class MaxSubsequence {

    public static int calcMaxSubsequence(int[] arr) {

        int curMax = arr[0];
        int maxSoFar = arr[0];

        for(int i=1; i<arr.length; i++) {
            curMax = Math.max(curMax + arr[i], arr[i]);
            maxSoFar = Math.max(curMax, maxSoFar);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {

        int[] array = {3, 2, 3, 1, 2};
        System.out.println("The maximum profit is: " + MaxSubsequence.calcMaxSubsequence(array));
    }
}
