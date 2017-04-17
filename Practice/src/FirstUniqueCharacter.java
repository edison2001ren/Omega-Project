import java.util.TreeMap;

/**
 * Created by sunl on 4/13/17.
 */
public class FirstUniqueCharacter {

    public int findFirstUniqueChar(String s) {

        int[] frequency = new int[26];
        for(int index = 0; index < s.length(); index++) {
            frequency[s.charAt(index) - 'a']++;
        }
        for(int index = 0; index < s.length(); index++) {
            if(frequency[s.charAt(index) - 'a'] == 1 ) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        FirstUniqueCharacter obj = new FirstUniqueCharacter();

        System.out.println("Index: " + obj.findFirstUniqueChar(s));

    }
}
