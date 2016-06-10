/**
 * Created by sunl on 6/10/16.
 */
class MergeTwoSortedArrays {
    /**
     * @param A and B: sorted integer array A and B.
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {

        int AIndex = 0;
        int BIndex = 0;

        if(A.length == 0 && B.length == 0) {
            return (new int[] {});
        }
        else if(A.length == 0 && B.length != 0) {
            return B;
        }
        else if(A.length != 0 && B.length == 0) {
            return A;
        }
        else {
            int[] C = new int[A.length + B.length];
            int CIndex = 0;
            while(AIndex < A.length || BIndex < B.length) {
                if(A[AIndex] < B[BIndex]) {
                    C[CIndex] = A[AIndex];
                    AIndex++;
                    CIndex++;
                }
                else if(A[AIndex] == B[BIndex]) {
                    C[CIndex] = A[AIndex];
                    AIndex++;
                    CIndex++;
                    C[CIndex] = B[BIndex];
                    BIndex++;
                    CIndex++;
                }
                else {
                    C[CIndex] = B[AIndex];
                    BIndex++;
                    CIndex++;
                }
            }

            return C;
        }

        // Write your code here
    }

    public static void main(String args[]) {
        int[] aArray = {1, 2 ,3, 4};
        int[] bArray = {2, 4, 5, 6};

        MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
        for(int k : obj.mergeSortedArray(aArray, bArray)) {
            System.out.print(k + " ");
        }
    }
}
