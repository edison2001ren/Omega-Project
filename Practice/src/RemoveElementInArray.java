/**
 * Created by sunl on 3/14/16.
 */
public class RemoveElementInArray {

    public static int removeElement(int[] numArray, int element) {

        int finalLength = numArray.length;

        for(int i=0; i<numArray.length; i++) {
            if(numArray[i] == element) {
                int k=i;
                int j=k+1;
                while (j<numArray.length) {
                    if (numArray[j] != 4) {
                        numArray[k] = numArray[j];
                        k++;
                        j++;
                    }
                    else {
                        numArray[k] = numArray[j];
                        k++;
                        j++;
                    }
                }
                RemoveElementInArray.printArray(numArray);
                System.out.println();
                finalLength -= 1;
            }
        }
        return finalLength;
    }

    public static void printArray(int[] numArray) {
        for (int a: numArray
             ) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {

        int[] numArray = {0,4,4,0,4,4,4,0,2};
        int element = 4;
        System.out.println("The new length of this array is: " + RemoveElementInArray.removeElement(numArray, element));
    }
}
