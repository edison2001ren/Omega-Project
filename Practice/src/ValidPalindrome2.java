/**
 * Created by sunl on 4/7/17.
 */
public class ValidPalindrome2 {

    public boolean isPalindrome(String s) {

        char[] arr = s.toLowerCase().toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while(left<right) {
            if(!isValidChar(arr, left)) {
                left++;
            }
            else if(!isValidChar(arr, right)) {
                right--;
            }
            else {
                if(arr[left] == arr[right]) {
                    left++;
                    right--;
                    continue;
                }
                else
                    return false;
            }
        }
        return true;
    }

    public boolean isValidChar(char[] charArray, int index) {
        if((charArray[index] >= 'A' && charArray[index] <= 'Z')
                || (charArray[index] >= 'a' && charArray[index] <= 'z')
                || (charArray[index] >= '0' && charArray[index] <= '9')) {
            return true;
        }
        else
            return false;
    }

    public boolean isPalindromeThreeLines(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }

    public static void main(String[] args) {
        String s = "`l;`` 1o1 ??;l`";
        ValidPalindrome2 obj = new ValidPalindrome2();
        System.out.println(obj.isPalindrome(s));
        System.out.println(obj.isPalindromeThreeLines(s));
    }
}
