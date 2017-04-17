import java.util.Stack;

/**
 * Created by sunl on 4/17/17.
 */
public class ReverseWordsInAString3 {

    public String reverseWords(String s) {

        Stack<String> st = new Stack<String>();
        if(s == null || s == " ") {
            return "";
        }
        else {
            String[] stringArray = s.split(" ");
            for(int i=0; i<stringArray.length; i++) {
                st.push(stringArray[i]);
            }
        }
        String returnString = "";
        while(!st.empty()) {
            returnString += (st.pop() + " ");
        }
        return returnString;

    }

    public static void main(String[] args) {

        ReverseWordsInAString3 obj = new ReverseWordsInAString3();
        String aString = "The sky is blue ";
        System.out.println("The reverse of this string is: " + obj.reverseWords(aString));
    }
}
