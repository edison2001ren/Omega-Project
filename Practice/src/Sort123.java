/**
 * Created by sunl on 4/19/17.
 */
public class Sort123 {

    public int[] sorting123(int[] a) {
        int l = 0;
        int r = a.length - 1;
        int i = 1;
        while(i<=r) {
            for(int k : a) {
                System.out.print(k + " ");
            }
            System.out.print("\t" + "i = " + i + " l = "+ l + " r = " + r);
            System.out.println();
            if(a[i] == 2 && i < a.length) {
                i++;
            }
            else if(a[i] == 1 && i < a.length) {
                swapElement(a, i, l);
                i++;
                while(a[l] == 1 && l+1 < a.length) {
                    l++;
                }

            }
            else if(a[i] == 3 && i < a.length) {
                swapElement(a, i, r);
                while(a[r] == 3 && r-1 > 0) {
                    r--;
                }
            }
        }
        return a;
    }

    public void swapElement(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] myArray = {2,1,1,3,1,1,3,3,1,1,3,3,3};
        Sort123 obj = new Sort123();
        for(int i : myArray) {
            System.out.print(i + " ");
        }
        System.out.println("\nAfter sorting: ");
        for(int i : obj.sorting123(myArray)) {
            System.out.print(i + " ");
        }
    }
}
