/**
 * Created by sunl on 1/17/17.
 */
public class MergeTwoSortedArray {


    public static int[] mergeList(int[] myList1, int[] myList2) {
        int[] myMergedList = new int[myList1.length + myList2.length];
        int mergedListIndex = 0;
        int list1Index = 0;
        int list2Index = 0;
        while(mergedListIndex < myMergedList.length) {
            if(list1Index < myList1.length && list2Index < myList2.length && myList1[list1Index] < myList2[list2Index]) {
                myMergedList[mergedListIndex] = myList1[list1Index];
                list1Index++;
                mergedListIndex++;
            }
            else if(list1Index < myList1.length && list2Index < myList2.length && myList1[list1Index] >= myList2[list2Index]) {
                myMergedList[mergedListIndex] = myList2[list2Index];
                list2Index++;
                mergedListIndex++;
            }
            else if(list1Index == myList1.length) {
                myMergedList[mergedListIndex] = myList2[list2Index];
                list2Index++;
                mergedListIndex++;
            }
            else if(list2Index == myList2.length) {
                myMergedList[mergedListIndex] = myList1[list1Index];
                list1Index++;
                mergedListIndex++;
            }
        }
        return myMergedList;
    }

    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5,7,9,9,101};
        int[] list2 = {2,2,5,7,7,9,202};

        int[] merged_list = MergeTwoSortedArray.mergeList(list1, list2);
        System.out.println("The merged list is: ");
        for(int i=0; i<merged_list.length;i++) {
            System.out.print(merged_list[i] + " ");
        }
    }
}