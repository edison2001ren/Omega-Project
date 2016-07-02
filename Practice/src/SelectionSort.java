/**
 * Created by sunl on 6/13/16.
 */
public class SelectionSort {

    public void swapElement(int one, int two, int[] a) {
        int temp;
        temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public int[] selectionSort(int[] unsorted) {
        for(int firstIndex = 0; firstIndex < unsorted.length; firstIndex++) {
            int minIndex = firstIndex;
            int nextIndex = firstIndex + 1;
            while(nextIndex < unsorted.length) {
                if(unsorted[nextIndex] < unsorted[minIndex]) {
                    minIndex = nextIndex;
                }
                nextIndex++;
            }
            swapElement(firstIndex, minIndex, unsorted);
        }
        return unsorted;
    }

    public static void main(String args[]) {
        int[] array = {77, 99, 44, 55, 22, 88, 11, 0, 66, 33};
        SelectionSort obj = new SelectionSort();
        for(int k: obj.selectionSort(array)) {
            System.out.print(k + " ");
        }
    }
}
