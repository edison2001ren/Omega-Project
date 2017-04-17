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
        for(String word : stringArray) {
            for(int i = word.length() - 1; i>=0; i--) {
                returnString += word.charAt(i);
            }
            returnString += " ";
        }
        return returnString.trim();
    }

    public String reverseWords2(String s)
    {
        char[] s1 = s.toCharArray();
        int i = 0;
        for(int j = 0; j < s1.length; j++)
        {
            if(s1[j] == ' ')
            {
                reverse(s1, i, j - 1);
                i = j + 1;
            }
        }
        // Don't forget the last word which does not have a trailing zero
        reverse(s1, i, s1.length - 1);
        return new String(s1);
    }

    public void reverse(char[] s, int l, int r)
    {
        while(l < r)
        {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++; r--;
        }
    }

    public static void main(String[] args) {

        ReverseWordsInAStringIII obj = new ReverseWordsInAStringIII();
        String aString = "Let's take LeetCode contest";
        System.out.println("The reverse of this string is: " + obj.reverseWords(aString));
        System.out.println("The reverse of this string is: " + obj.reverseWords2(aString));
    }
}
