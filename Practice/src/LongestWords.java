import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by sunl on 4/12/16.
 * Tested and passed on Lintcode on 4/15/16.
 */
public class LongestWords {

    ArrayList<String> longestWords(String[] dictionary) {

        if(dictionary == null || dictionary.length == 0) {
            return null;
        }
        HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
        int max = 0;
        for(int i = 0; i < dictionary.length; i++) {
            int length = dictionary[i].length();
            if(map.containsKey(length)) {
                map.get(length).add(dictionary[i]);
            }
            else {
                if(dictionary[i].length() > max) {
                    max = dictionary[i].length();
                    ArrayList<String> list = new ArrayList<String>();
                    list.add(dictionary[i]);
                    map.put(length, list);
                }
            }
        }
        return map.get(max);
        // write your code here
    }

    public static void main(String[] args) {
        String[] stringArray = {"zscqe", "aahcqm", "assljum", "dsdjluqh", "eewsrowlv"};
        LongestWords lw = new LongestWords();
        lw.longestWords(stringArray);
    }
}
