import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by sunl on 4/13/16.
 */
public class Anagrams2 {

    public ArrayList<String> anagrams2(String[] strs) {
        ArrayList<String> res = new ArrayList<String>();
        if(strs == null || strs.length == 0)
            return res;
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(int i=0;i<strs.length;i++)
        {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);
            if(map.containsKey(str))
            {
                map.get(str).add(strs[i]);
            }
            else
            {
                ArrayList<String> list = new ArrayList<String>();
                list.add(strs[i]);
                map.put(str,list);
            }
        }
        Iterator iter = map.values().iterator();
        while(iter.hasNext())
        {
            ArrayList<String> item = (ArrayList<String>)iter.next();
            if(item.size()>1)
                res.addAll(item);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] myStrings = {"abcd", "bcda"};

        Anagrams2 ana = new Anagrams2();
        ana.anagrams2(myStrings);
    }
}
