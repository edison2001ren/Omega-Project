/**
 * Created by sunl on 6/20/16.
 */
public class InsertionSort2 {

    public void insertionSort(int[] unsorted) {
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
            HelperFunctions.printArray(unsorted);
        }
    }

    public static void main(String args[]) {
        int[] array = {6, 8, 1, 4, 5, 3, 7, 2};
        InsertionSort2 obj = new InsertionSort2();
        HelperFunctions.printArray(array);
        obj.insertionSort(array);
    }
}