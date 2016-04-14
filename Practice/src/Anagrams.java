/**
 * Created by sunl on 4/13/16.
 * /**
 * @param s: The first string
 * @param b: The second string
 * @return true or false
 */

public class Anagrams {

    public boolean anagrams(String s, String t) {

        if(s.length() != t.length())
            return false;

        int[] SS = new int[26];
        int[] TT = new int[26];

        for(int i=0; i<s.length(); i++) {
            SS[s.charAt(i) - 'a']++;
        }
        for(int j=0; j<t.length(); j++) {
            TT[t.charAt(j) - 'a']++;
            if(TT[t.charAt(j) - 'a'] > SS[s.charAt(j) - 'a']) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String aString = "happy new year";
        String bString = "n ahwryeypp ea";

        Anagrams ana = new Anagrams();
        if(ana.anagrams(aString, bString)) {
            System.out.println(aString + ", " + bString + " are Anagrams!");
        }
        else
            System.out.println(aString + ", " + bString + " are NOT Anagrams!!!");
    }
}
