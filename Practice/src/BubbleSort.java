/**
 * Created by sunl on 6/10/16.
 */
public class BubbleSort {

    public void swapElement(int one, int two, int[] a) {
        int temp;
        temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public int[] bubbleSort(int[] unsorted) {
        int lastElement = unsorted.length - 1;
        for(int out=lastElement; out>1; out--) {
            for(int in=0; in<out; in++) {
                if(unsorted[in] > unsorted[in+1]) {
                    swapElement(in, in+1, unsorted);
                }
            }
        }
        return unsorted;
    }

    public static void main(String args[]) {
        int[] array = {77, 99, 44, 55, 22, 88, 11, 0, 66, 33};
        BubbleSort obj = new BubbleSort();
        for(int k: obj.bubbleSort(array)) {
            System.out.print(k + " ");
        }
    }
}
