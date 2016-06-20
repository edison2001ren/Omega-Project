/**
 * Created by sunl on 6/20/16.
 */
public class InsertionSort {

    public int[] insertionSort(int[] unsorted) {
        for(int out=1; out<unsorted.length; out++) {
            if(unsorted[out] >= unsorted[out-1]) {
                continue;
            }
            else {
                int targetIndex = out;
                int temp = unsorted[out];
                while(targetIndex >= 1 && unsorted[targetIndex-1] > temp) {
                    unsorted[targetIndex] = unsorted[targetIndex-1];
                    targetIndex--;
                }
                unsorted[targetIndex] = temp;
            }
        }
        return unsorted;
    }

    public static void main(String args[]) {
        int[] array = {77, 99, 44, 55, 22, 88, 11, 0, 66, 33};
        InsertionSort obj = new InsertionSort();
        for(int k: obj.insertionSort(array)) {
            System.out.print(k + " ");
        }
    }
}
