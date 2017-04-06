import java.util.HashMap;
/**
 * Created by sunl on 4/5/17.
 */
public class RansomNote {

    public boolean canConstructMap(String ransomNote, String magazine) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        char[] magazineArr = magazine.toCharArray();
        char[] ransomNoteArr = ransomNote.toCharArray();

        for(char ch: magazineArr) {
            if(!hm.containsKey(ch)) {
                hm.put(ch, 1);
            }
            else
                hm.put(ch, hm.get(ch).intValue() + 1);
        }
        for(char ch: ransomNoteArr) {
            if(!hm.containsKey(ch)) {
                return false;
            }
            else if(hm.get(ch).intValue() == 1) {
                hm.remove(ch);
            }
            else
                hm.put(ch, hm.get(ch).intValue() - 1);
        }
        return true;
    }

    public boolean canConstructArray(String ransomNote, String magazine) {
        int[] table = new int[128];
        for (char c : magazine.toCharArray())   table[c]++;
        for (char c : ransomNote.toCharArray())
            if (--table[c] < 0) return false;
        return true;
    }

    public static void main(String[] arg) {
        String ransomNote = "aa";
        String magazine = "aab";
        RansomNote rn = new RansomNote();
        System.out.println("The answer is :" + rn.canConstructMap(ransomNote, magazine));
        System.out.println("The answer is :" + rn.canConstructArray(ransomNote, magazine));
    }
}
