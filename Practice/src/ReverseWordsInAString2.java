import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by sunl on 7/2/16.
 */
public class ReverseWordsInAString2 {

    public String reverseWords(String s) {

        Stack<String> st = new Stack<String>();
        if(s==null && s=="") {
            return "";
        }
        else {
            char[] stringArray = s.toCharArray();
            for(int i=0; i<stringArray.length; i++) {
                if(stringArray[i] == ' ') {
                    continue;
                }
                else {
                    int endIndex = i;
                    ArrayList<Character> wordArray = new ArrayList<Character>();
                    while((endIndex <= stringArray.length - 1) && stringArray[endIndex] != ' ') {
                        wordArray.add(stringArray[endIndex]);
                        endIndex++;
                    }
                    String wordString = "";
                    for (Character c : wordArray)
                    {
                        wordString += c;
                    }
                    st.push(wordString);
                    i = endIndex++;
                }
            }
        }
        String reverseString = "";
        while(!st.empty()) {
            reverseString += st.pop() + " ";
        }
        return reverseString;
    }

    public static void main(String[] args) {

        ReverseWordsInAString2 obj = new ReverseWordsInAString2();
        String aString = "The sky is blue ";
        System.out.println("The reverse of this string is: " + obj.reverseWords(aString));
    }
}
