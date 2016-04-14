import java.util.Arrays;

/**
 * Created by sunl on 4/13/16.
 */
public class Anagrams2 {

    public boolean anagrams2(String s, String t) {
        if(s.length() != t.length())
            return false;
        String newSString = "";
        String newTString = "";

        char[] charArrS = s.toCharArray();
        Arrays.sort(charArrS);
        newSString = new String(charArrS);

        char[] charArrT = t.toCharArray();
        Arrays.sort(charArrT);
        newTString = new String(charArrT);

        if(newSString.equals(newTString)) {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        String aString = "happy new year";
        String bString = "n ahwryeypp ea";

        Anagrams2 ana = new Anagrams2();
        if(ana.anagrams2(aString, bString)) {
            System.out.println(aString + ", " + bString + " are Anagrams!");
        }
        else
            System.out.println(aString + ", " + bString + " are NOT Anagrams!!!");
    }
}
