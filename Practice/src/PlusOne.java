/**
 * Created by sunl on 4/25/17.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carrier = 1;
        int[] copyArr = new int[digits.length+1];
        for(int i=digits.length-1;i>=0;i--) {
            if(i == 0 && digits[i]+carrier == 10) {
                copyArr[0] = 1;
                copyArr[1] = 0;
                for(int j = 2; j<copyArr.length;j++) {
                    copyArr[j] = digits[j-1];
                }
            }
            else if(digits[i]+carrier==10) {
                digits[i] = 0;
                carrier = 1;
            }
            else {
                digits[i] += carrier;
                carrier = 0;
            }
        }
        if(copyArr[0] == 0) {
            return digits;
        }
        else
            return copyArr;
    }

    public void printNum(int[] myArr) {
        for(int n : myArr) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9};
        PlusOne obj = new PlusOne();
        obj.printNum(arr);
        System.out.println("\nAfter plus one is: ");
        obj.printNum(obj.plusOne(arr));
    }
}
