/**
 * Created by sunl on 3/14/16.
 */
public class RemoveElementInArray {

    public static int removeElement(int[] A, int elem) {

        int i=0;
        int j=0;

        while(j < A.length){
            if(A[j] != elem){
                A[i] = A[j];
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {

        int[] numArray = {0,4,4,0,4,4,4,0,2};
        int element = 4;
        System.out.println("The new length of this array is: " + RemoveElementInArray.removeElement(numArray, element));
    }
}
