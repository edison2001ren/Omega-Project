import java.util.ArrayList;

/**
 * Created by sunl on 6/7/16.
 */
public class RotateString {
    /**
     * @param str: an array of char
     * @param offset: an integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {

        if(str.length == 0) {
            str = str;
        }
        else {
            int movePos = offset % str.length;
            int startPos = str.length - movePos;
            int endPos = str.length;
            ArrayList<Character> al = new ArrayList<Character>();
            for (int i = startPos; i < endPos; i++) {
                al.add(str[i]);
            }
            for (int j = endPos - 1; j >= movePos; j--) {
                str[j] = str[j - movePos];
            }
            for (int k = 0; k < movePos; k++) {
                str[k] = al.get(k);
            }
        }
        for(char c: str) {
            System.out.print(c + " ");
        }
        // write your code here
    }

    public static void main(String[] args) {

        String myString = "";
        char[] myCharArray = myString.toCharArray();

        RotateString obj = new RotateString();
        obj.rotateString(myCharArray, 10);

    }
}
