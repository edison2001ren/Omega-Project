import java.util.Stack;

/**
 * Created by sunl on 4/7/17.
 */
public class ReverseString2 {

    public String reverseStr(String s, int k) {

        Stack<Character> st = new Stack<Character>();
        char[] charArray = s.toCharArray();
        boolean flip = true;
        int remaining_character = charArray.length;
        StringBuilder resultStr = new StringBuilder();

        for(int index = 0; index < charArray.length;) {
            if(flip == false && remaining_character/k > 0) {
                int counter = 0;
                for(int seg_index = index; seg_index < index + k; seg_index++) {
                    resultStr.append(charArray[seg_index]);
                    counter++;
                }
                remaining_character -= counter;
                index += counter;
                flip = true;
            }
            else if(flip == true && remaining_character/k > 0) {
                int counter = 0;
                for(int seg_index = index; seg_index < index + k; seg_index++) {
                    st.push(charArray[seg_index]);
                }
                while(!st.empty()) {
                    resultStr.append(st.pop());
                    counter++;
                }
                remaining_character -= counter;
                index += counter;
                flip = false;
            }
            else if(flip == false && remaining_character/k == 0) {
                for(int seg_index = index; seg_index < charArray.length; seg_index++) {
                    resultStr.append(charArray[seg_index]);
                    index++;
                }
            }
            else if(flip == true && remaining_character/k == 0) {
                for(int seg_index = index; seg_index < charArray.length; seg_index++) {
                    st.push(charArray[seg_index]);
                }
                while(!st.empty()) {
                    resultStr.append(st.pop());
                    index++;
                }
            }
        }
        return resultStr.toString();
    }

    public String reverseStrAnswer(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }
    private void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    public String reverseStrStringBuilder(String s, int k) {
        StringBuilder sb = new StringBuilder();

        int i = 0, j = 0;
        while (i < s.length()) {
            // first k
            j = i + k <= s.length() ? i + k : s.length();
            sb.append((new StringBuilder(s.substring(i, j))).reverse().toString());

            if (j >= s.length()) break;

            // second k
            i = j;
            j = i + k <= s.length() ? i + k : s.length();
            sb.append(s.substring(i, j));

            i = j;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "abcdef";
        int k = 2;
        ReverseString2 obj = new ReverseString2();
        System.out.println(input);
        System.out.println(obj.reverseStr(input, k));
        System.out.println(obj.reverseStrAnswer(input, k));
        System.out.println(obj.reverseStrStringBuilder(input, k));
    }
}
