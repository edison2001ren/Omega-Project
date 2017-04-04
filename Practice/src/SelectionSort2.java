/**
 * Created by Toda Erika on 4/3/2017.
 */
public class SelectionSort2 {

    private int minIndex;
    private int startIndex;
    private static int numOfSwaps;

    public void interchange(int i, int j, int[] a) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;

    }

    public int[] selectionSortArray(int[] myArray) {
        while(startIndex < myArray.length - 1) {
            int minNum = myArray[startIndex];
            for(int index = startIndex + 1; index < myArray.length; index++) {
                if(myArray[index] < minNum) {
                    minNum = myArray[index];
                    minIndex = index;
                }
            }
            interchange(minIndex, startIndex, myArray);
            numOfSwaps++;
            startIndex++;
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] unsortedArray = {8,6,11,17,3,15,5,19,28,12};
        SelectionSort2 obj = new SelectionSort2();
        int[] sorted_array = obj.selectionSortArray(unsortedArray);
        System.out.println("After the Selection Sort :");
        for (int element: sorted_array) {
            System.out.print(element + " ");
        }
        System.out.println("\nTotal swaps: " + SelectionSort2.numOfSwaps);
    }
}
