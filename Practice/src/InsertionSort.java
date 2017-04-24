/**
 * Created by sunl on 4/23/17.
 */
public class InsertionSort {

    public void insertionSort(int[] unsorted) {

        int i,j = 0;
        int temp = 0;

        for(i = 1; i<unsorted.length; i++) {
            temp = unsorted[i];
            j = i;
            while(j >= 1 && unsorted[j-1] > temp) {
                unsorted[j] = unsorted[j-1];
                j--;
            }
            unsorted[j] = temp;
            HelperMethod.printArray(unsorted);
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 8, 1, 4, 5, 3, 7, 2};
        InsertionSort obj = new InsertionSort();
        HelperMethod.printArray(array);
        obj.insertionSort(array);
    }
}
