/**
 * Created by sunl on 4/17/17.
 */
public class LengthOfLastWord2 {

    public int lengthOfLastWord(String s) {

        if(s == null || s == "") {
            return 0;
        }
        int endIndex = s.length() - 1;
        int last_word_length = 0;
        if(s.charAt(endIndex) == ' ') {
            return 0;
        }
        else {
            while(s.charAt(endIndex--) != ' ') {
                last_word_length++;
            }
            return last_word_length;
        }
    }

    public static void main(String[] args) {

        String myString = "";
        LengthOfLastWord2 obj = new LengthOfLastWord2();
        System.out.println("The length of last word is : " + obj.lengthOfLastWord(myString));
    }
}
