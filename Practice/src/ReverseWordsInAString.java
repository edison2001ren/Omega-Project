/**
 * Created by sunl on 3/9/16.
 */
public class ReverseWordsInAString {

    public String reverseWords(String s) {

        String t = "";
        int fromIndex = 0;
        int endIndex = 0;
        String subString = s;
        String space = " ";
        while (fromIndex < s.length()) {
            endIndex = s.indexOf(space, fromIndex);
            fromIndex = endIndex + 1;
            s = s.substring(fromIndex, s.length() - 1);
        }
        return t;
        // write your code
    }

    public static void main(String[] args) {

        ReverseWordsInAString obj = new ReverseWordsInAString();
        String aString = "The sky is blue";
        System.out.println(aString.indexOf(" "));
        System.out.println("The reverse of this string is: " + obj.reverseWords(aString));
    }
}