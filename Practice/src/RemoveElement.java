/**
 * Created by sunl on 5/7/17.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int returnVal = nums.length;
        int endIndex = nums.length - 1;
        for(int i=0; i<nums.length; i++) {
            if(endIndex < i) {
                break;
            }
            else if(nums[i]==val) {
                for(int j = i; j<endIndex;j++) {
                    nums[j]=nums[j+1];
                }
                nums[endIndex]=val;
                i--;
                endIndex--;
                returnVal--;
            }
        }
        HelperMethod.printArray(nums);
        return returnVal;
    }

    public int removeElementSolution(int[] A, int elem) {
        int m = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] != elem){
                A[m] = A[i];
                m++;
            }
        }
        HelperMethod.printArray(A);
        return m;
    }


    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int[] arr2 = {3,2,2,3};
        int target = 2;
        RemoveElement obj = new RemoveElement();
        System.out.println("The new length is: " + obj.removeElement(arr, target));
        System.out.println("The new length is: " + obj.removeElementSolution(arr2, target));
    }
}
