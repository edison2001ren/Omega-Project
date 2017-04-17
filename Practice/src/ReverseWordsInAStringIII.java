import java.util.Stack;

/**
 * Created by sunl on 4/17/17.
 */
public class ReverseWordsInAStringIII {

    public String reverseWords(String s) {

        if(s == null || s == "") {
            return "";
        }
        String[] stringArray = s.split(" ");
        String returnString = "";
        Stack<Character> st = new Stack<Character>();
        for(String word : stringArray) {
            for(int i = 0; i<word.length(); i++) {
                st.push(word.charAt(i));
            }
            while(!st.empty()) {
                returnString += st.pop();
            }
            returnString += " ";
        }
        return returnString.trim();
    }

    public static void main(String[] args) {

        ReverseWordsInAStringIII obj = new ReverseWordsInAStringIII();
        String aString = "Let's take LeetCode contest";
        System.out.println("The reverse of this string is: " + obj.reverseWords(aString));
    }
}
