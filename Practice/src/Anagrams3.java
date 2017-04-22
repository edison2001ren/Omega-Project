/**
 * Created by sunl on 4/21/17.
 */
public class Anagrams3 {

    public boolean anagram3(String s, String t) {

        char[] charArrayS = s.toLowerCase().toCharArray();
        char[] charArrayT = t.toLowerCase().toCharArray();
        int[] freq = new int[26];

        for(char ch : charArrayS) {
            freq[ch - 'a']++;
        }

        for(char ch : charArrayT) {
            if(freq[ch - 'a'] == 0) {
                return false;
            }
            else
                freq[ch - 'a']--;
        }
        for(int i=0; i<26; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }
        return true;
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
