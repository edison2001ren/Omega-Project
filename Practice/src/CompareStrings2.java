/**
 * Created by sunl on 4/13/16.
 */
public class CompareStrings2 {

    public boolean compareStrings2(String A, String B) {
        int[] AA = new int[26];
        int[] BB = new int[26];
        for (int i = 0; i < A.length(); i++) {
            AA[A.charAt(i) - 'A']++;
        }
        for (int i = 0; i < B.length(); i++) {
            BB[B.charAt(i) - 'A']++;
            if (BB[B.charAt(i) - 'A'] > AA[B.charAt(i) - 'A'])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String aString = "ABCDEFG";
        String bString = "ACC";

        CompareStrings2 cs = new CompareStrings2();
        if(cs.compareStrings2(aString, bString)) {
            System.out.println(aString + " contains all letters in " + bString);
        }
        else
            System.out.println(aString + " does not contain all letters in " + bString);
    }
}
