import java.util.TreeMap;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by sunl on 6/10/16.
 */
public class MergeTwoSortedArrays3 {

    private int[] mergeSortedArray(int[] A, int[] B) {

        int AIndex = 0;
        int BIndex = 0;

        TreeMap treeMap = new TreeMap();

        for(AIndex = 0; AIndex < A.length; AIndex++) {

        }

        /*
        get Collection of values contained in TreeMap using
        Collection values()
        */
        Collection c = treeMap.values();

        //obtain an Iterator for Collection
        Iterator itr = c.iterator();

        //iterate through TreeMap values iterator
        while (itr.hasNext())
            System.out.println(itr.next());

        return null;
    }

    public static void main(String args[]) {
        int[] aArray = {1, 2 ,3, 4};
        int[] bArray = {2, 4, 5, 6};

        MergeTwoSortedArrays2 obj = new MergeTwoSortedArrays2();
        for(int k : obj.mergeSortedArray(aArray, bArray)) {
            System.out.print(k + " ");
        }
    }
}
