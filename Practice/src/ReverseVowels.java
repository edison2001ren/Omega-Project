/**
 * Created by sunl on 4/7/17.
 */
public class ReverseVowels {

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] charArray = s.toCharArray();
        while(left < right) {
            while(!isVowels(charArray, left)) {
                left++;
            }
            while(!isVowels(charArray, right)) {
                right--;
            }
            if(left < right) {
                swap(charArray, left, right);
                left++;
                right--;
            }
            else
                break;
        }
        return new String(charArray);
    }

    public void swap(char[] arr, int l, int r) {
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public boolean isVowels(char[] arr, int index) {
        return arr[index] == 'a' || arr[index] == 'e' || arr[index] == 'i' ||
                arr[index] == 'o' || arr[index] == 'u' || arr[index] == 'A' ||
                arr[index] == 'E' || arr[index] == 'I' || arr[index] == 'O' || arr[index] == 'U';
    }

    public static void main(String[] args) {
        String s = "favorite";
        ReverseVowels obj = new ReverseVowels();
        System.out.println(s);
        System.out.println(obj.reverseVowels(s));
    }
}
