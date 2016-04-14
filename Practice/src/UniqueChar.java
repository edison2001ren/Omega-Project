import java.util.Hashtable;

/**
 * Created by sunl on 4/13/16.
 */
public class UniqueChar {

    public boolean isUnique(String str) {

        if(str.length()==0 || str=="") {
            return true;
        }
        char[] charArray = str.toCharArray();
        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
        for(int i=0; i<charArray.length; i++) {
            if(ht.containsKey(charArray[i])) {
                return false;
            }
            else
                ht.put(charArray[i], i);
        }
        return true;
    }
}
