/**
 * Created by Toda Erika on 4/4/2017.
 */
public class BubbleSort2 {

    private int minIndex;
    private int startIndex;
    private static int numOfSwaps;

    public void interchange(int i, int j, int[] a) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }

    public int[] bubbleSortArray(int[] myArray) {
        while(startIndex < myArray.length - 1) {
            minIndex = startIndex;
            for(int index = startIndex + 1; index < myArray.length; index++) {
                if(myArray[index] < myArray[minIndex]) {
                    interchange(index, minIndex, myArray);
                    numOfSwaps++;
                }
            }
            startIndex++;
            System.out.println();
            for(int element: myArray) {
                System.out.print(element + " ");
            }
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] unsortedArray = {8,6,11,17,3,15,5,19,28,12};
        BubbleSort2 obj = new BubbleSort2();
        int[] sorted_array = obj.bubbleSortArray(unsortedArray);
        System.out.println("\nAfter the Selection Sort :");
        for (int element: sorted_array) {
            System.out.print(element + " ");
        }
        System.out.println("\nTotal swaps: " + BubbleSort2.numOfSwaps);
    }
}
